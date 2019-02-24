package pl.sda.library.model;



import java.util.Objects;



public abstract class Book extends Medium {



    protected Creator author;



    public Creator getAuthor() {

        return author;

    }



    public void setAuthor(Creator author) {

        this.author = author;

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Book book = (Book) o;
        return Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), author);
    }

    @Override
    public String toString() {
        return "Book{" +
                "author=" + author +
                ", title='" + title + '\'' +
                ", state=" + state +
                '}';
    }
}