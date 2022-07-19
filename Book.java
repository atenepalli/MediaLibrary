import java.util.List;

/**
 * concrete class that inherits from Media and represents books
 */
public class Book extends Media {
    private String title;
    private String author;
    private String publisher;

    /**
     * constructor
     * @param format - format of media
     * @param isbn - isbn of media
     * @param genre - genre of media
     * @param author - author of boook
     * @param title - title of book
     * @param publisher - publisher of book
     */
    public Book(Format format, String isbn, String genre, String author, String title, String publisher) {
        super(format, isbn, genre);
        this.author = author;
        this.title = title;
        this.publisher = publisher;
    }

    /**
     * getter method
     * @return title
     */
    public final String getTitle() {
        return title;
    }

    /**
     * getter method
     * @return author
     */
    public final String getAuthor() {
        return author;
    }

    /**
     * getter method
     * @return publisher
     */
    public final String getPublisher() {
        return publisher;
    }

    /**
     * returns type
     * @return type
     */
    @Override
    public String getType() {
        return "Book";
    }

    /**
     * formats string
     * @return string
     */
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", " + super.toString();
    }

    /**
     * compares book based on instance variables
     * @param o - Media type
     * @return int
     */
    @Override
    public int compareTo(Media o) {
        if (o instanceof Book) {
            Book other = (Book) o;
            int i = author.compareTo(other.getAuthor());
            if (i != 0) return i;
            return title.compareTo(other.getTitle());
        }
        return 0;
    }
}
