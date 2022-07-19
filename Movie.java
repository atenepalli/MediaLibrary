import java.util.ArrayList;
import java.util.List;

/**
 * This is a concrete class that inherits from Media and represents movies
 */
public class Movie extends Media {
    private String title;
    private String director;
    private int year;
    private List<String> cast = new ArrayList<>();

    /**
     * constructor
     * @param format - format of media
     * @param isbn - isbn of media
     * @param genre - genre of media
     * @param title - title of movie
     * @param director - director of movie
     * @param year - year movie was made
     * @param cast - cast of movie
     */
    public Movie(Format format, String isbn, String genre, String title, String director, int year, List<String> cast) {
        super(format, isbn, genre);
        this.title = title;
        this.director = director;
        this.year = year;
        this.cast.addAll(cast);
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
     * @return director
     */
    public final String getDirector() {
        return director;
    }

    /**
     * getter method
     * @return year
     */
    public final int getYear() {
        return year;
    }

    /**
     * getter method
     * @return cast
     */
    public final List<String> getCast() {
        return cast;
    }


    /**
     * returns media type
     * @return type
     */
    @Override
    public String getType() {
        return "Movie";
    }

    /**
     * formats string
     * @return String
     */
    @Override
    public String toString() {
        return "Title: " + title + ", Year: " + year + ", " + super.toString();
    }

    /**
     * compares Movies based on instance variables
     * @param o - Media type
     * @return int
     */
    @Override
    public int compareTo(Media o) {
        if (o instanceof Movie) {
            Movie other = (Movie) o;
            int i = title.compareTo(other.getTitle());
            if (i != 0) return i;
            return Integer.compare(year, other.getYear());
        }
        return 0;
    }
}
