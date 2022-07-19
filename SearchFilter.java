/**
 * This is a concrete class that implements the MediaFilter interface, and represents a search style
 * filter, matching labeled media items which contain a given search string among their data members, or
 * in their label
 */
public class SearchFilter implements MediaFilter {
    private String searchTerm;

    /**
     * constructor
     * @param searchTerm - String
     */
    public SearchFilter(String searchTerm) {
        this.searchTerm = searchTerm;
    }

    /**
     * checks if abel contains the searchTerm, or if the
     * searchTerm is in the string returned by the toString method of the media item
     * @param label - Label
     * @return boolean
     */
    @Override
    public boolean matches(Label<String, Media> label) {
        return (searchTerm.indexOf(label.getKey()) > 0 || searchTerm.indexOf(label.getValue().toString()) > 0);
    }
}
