/**
 * represents different kinds of media (music, movies, books, etc.)
 */
public abstract class Media implements Comparable<Media> {
    private String isbn;
    private String genre;
    private Format format;

    /**
     * constructor
     * @param format - forms of media
     * @param isbn - media isbn
     * @param genre - media genre
     */
    public Media(Format format, String isbn, String genre) {
        this.format = format;
        this.isbn = isbn;
        this.genre = genre;
    }

    /**
     * getter method
     * @return isbn
     */
    public final String getISBN() {
        return isbn;
    }

    /**
     * getter method
     * @return genre
     */
    public final String getGenre() {
        return genre;
    }

    /**
     * getter method
     * @return format
     */
    public final Format getFormat() {
        return format;
    }

    public abstract String getType();

    @Override
    public boolean equals(Object o) {
        return (o != null && o instanceof Media && this.getISBN().equals(((Media) o).getISBN()));
    }

    @Override
    public String toString() {
        return "Type: " + getType() + ", ISBN: " + isbn + ", Genre: " + genre + ", Format: " + format;
    }

}



