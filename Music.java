/**
 * This is an abstract subclass of Media that represents different types of music
 */
public abstract class Music extends Media {
    private String artist;
    private String title;
    private int year;

    /**
     * constructor
     * @param format - format of media
     * @param isbn - isbn of media
     * @param genre - genre of media
     * @param artist - artist of Music
     * @param title - title of Music
     * @param year - year of Music
     */
    public Music (Format format, String isbn, String genre, String artist, String title, int year) {
        super(format, isbn, genre);
        this.artist = artist;
        this.title = title;
        this.year = year;
    }

    /**
     * getter method
     * @return artist
     */
    public final String getArtist() {
        return artist;
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
     * @return year
     */
    public final int getYear() {
        return year;
    }

    /**
     * formats string
     * @return String
     */
    @Override
    public String toString() {
        return "Artist: " + artist + ", Year: " + year + ", Title: " + title + ", " + super.toString();
    }

    /**
     * compares Music based on instance variables
     * @param o - Media type
     * @return int
     */
    @Override
    public int compareTo(Media o) {
        if(o instanceof Music) {
            Music other = (Music) o;
            int i = artist.compareTo(other.getArtist());
            if (i != 0) return i;
            i = Integer.compare(year, other.getYear());
            if (i != 0) return i;
            return title.compareTo(other.getTitle());
        }
        return 0;
    }
}
