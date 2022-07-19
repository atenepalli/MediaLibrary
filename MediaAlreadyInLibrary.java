/**
 * This is an exception that inherits from Exception and represents the situation where two or more
 * labeled media items with the same ISBN are added to the media library
 */
public class MediaAlreadyInLibrary extends Exception {
    private String name;
    private Media media;

    /**
     * getter method
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * getter method
     * @return name
     */
    public Media getMedia() {
        return media;
    }

    /**
     * constructor
     * @param name - name
     * @param media - media
     */
    public MediaAlreadyInLibrary(String name, Media media) {
        super("Media already in library.");
        this.name = name;
        this.media = media;
    }
}
