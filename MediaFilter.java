/**
 * This interface contains a single method, matches
 */
public interface MediaFilter {
    public boolean matches(Label<String, Media> label);
}
