import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This class represents the library of media items
 */
public class MediaLibrary {
    private List<Label<String, Media>> library;

    /**
     * default constructor
     */
    public MediaLibrary() {
        library = new ArrayList<>();
    }

    /**
     * A method for adding media to the library
     * @param name - name
     * @param media - media
     * @throws MediaAlreadyInLibrary
     */
    public void add(String name, Media media) throws MediaAlreadyInLibrary {
        Label<String, Media> newLabel = new Label(name, media);
        for (Label label: library) {
            if (label.equals(newLabel)) {
                throw new MediaAlreadyInLibrary(name, media);
            }
        }
        library.add(newLabel);
    }

    /**
     * This method creates and returns a new list of labeled media items
     * @param mediaFilter - MediaFilter
     * @return List
     */
    public List<Label<String, Media>> filter(MediaFilter mediaFilter) {
        List<Label<String, Media>> filteredLibrary = new ArrayList<>();
        for (Label label : library) {
            if (mediaFilter.matches(label)) {
                filteredLibrary.add(label);
            }
        }
        return filteredLibrary;
    }

    /**
     * This method sorts the data member library
     */
    public void sort() {
        Collections.sort(library);
    }
}
