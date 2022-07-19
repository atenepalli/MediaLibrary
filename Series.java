import java.util.ArrayList;
import java.util.List;

/**
 * This is a concrete class that inherits from Media and represents TV series
 */
public class Series extends Media {
    private String title;
    private List<String> cast = new ArrayList<>();
    private List<String> episodes = new ArrayList<>();

    /**
     * constructor
     * @param format - format of media
     * @param isbn - isbn of media
     * @param genre - genre of media
     * @param title - title of series
     * @param cast - cast of series
     * @param episodes - episodes of series
     */
    public Series(Format format, String isbn, String genre, String title, List<String> cast, List<String> episodes) {
        super(format, isbn, genre);
        this.title = title;
        this.cast.addAll(cast);
        this.episodes.addAll(episodes);
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
     * @return cast
     */
    public final List<String> getCast() {
        return cast;
    }

    /**
     * getter method
     * @return episodes
     */
    public final List<String> getEpisodes() {
        return episodes;
    }

    /**
     * formats string
     * @return String
     */
    @Override
    public String toString() {
        return "Title: " + title + ", " + super.toString();
    }

    /**
     * gets type
     * @return type
     */
    @Override
    public String getType() {
        return "Series";
    }

    /**
     * compares series based on instance variables
     * @param o
     * @return
     */
    @Override
    public int compareTo(Media o) {
        if(o instanceof Series) {
            Series other = (Series) o;
            return title.compareTo(other.getTitle());
        }
        return 0;
    }
}
