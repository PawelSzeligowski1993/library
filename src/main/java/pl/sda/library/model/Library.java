package pl.sda.library.model;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;



public class Library<T extends Medium> {
    private List<T> media = new LinkedList<>();
    public List<T> getMedia() {
        return Collections.unmodifiableList(media);
    }
    public void setMedia(List<T> media) {
        assert media != null;
        this.media = new LinkedList<>(media);
    }

    public void addMedium(T medium){
        if (media == null){
            media = new LinkedList<>();
        }
        media.add(medium);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library<?> library = (Library<?>) o;
        return Objects.equals(media, library.media);
    }

    @Override
    public int hashCode() {
        return Objects.hash(media);
    }

    @Override
    public String toString() {
        return "Library{" +
                "media=" + media +
                '}';
    }
}