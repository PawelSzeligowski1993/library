package pl.sda.library.model;

import java.util.Objects;

public class Magazine extends Medium implements PaperMedium{

    private int number;
    private int pageCounter;

    Magazine() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public int getPageCount() {
        return pageCounter;
    }

    @Override
    public void setPageCount(int pageCount) {
        this.pageCounter = pageCount;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Magazine magazine = (Magazine) o;
        return number == magazine.number &&
                pageCounter == magazine.pageCounter;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), number, pageCounter);
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "number=" + number +
                ", pageCounter=" + pageCounter +
                ", title='" + title + '\'' +
                ", state=" + state +
                '}';
    }
}
