/**
 * This is a concrete class that inherits from Music and represents singles
 */
public class Single extends Music {
    public Single(Format format, String isbn, String genre, String artist, String title, int year) {
        super(format, isbn, genre, artist, title, year);
    }

    /**
     * gets type
     * @return String
     */
    @Override
    public String getType() {
        return "Single";
    }
}
