import java.util.ArrayList;
import java.util.List;

/**
 * concrete class that inherits from Music and represents singles
 */
public class Album extends Music {
    private List<String> trackList = new ArrayList<>();

    /**
     * constructor
     * @param format - format of media
     * @param isbn - isbn of media
     * @param genre - genre of media
     * @param artist - artist of album
     * @param title - title of album
     * @param year - year of album
     * @param trackList - album tracklist
     */
    public Album(Format format, String isbn, String genre, String artist, String title, int year, List<String> trackList) {
        super(format, isbn, genre, artist, title, year);
        this.trackList.addAll(trackList);
    }

    /**
     * getter method
     * @return tracklist
     */
    public List<String> getTrackList() {
        return trackList;
    }

    /**
     * gives type
     * @return album type
     */
    @Override
    public String getType() {
        return "Album";
    }

    /**
     * formats string
     * @return string
     */
    @Override
    public String toString() {
        return super.toString() + ", Tracks: " + trackList;
    }
}
