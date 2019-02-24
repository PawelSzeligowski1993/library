
package pl.sda.library.model;

import java.util.Objects;

public abstract class Medium {

    protected String title;
    protected MediumState state;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public MediumState getState() {
        return state;
    }

    public void setState(MediumState state) {
        this.state = state;
    }

    public String getType(){
        return  getClass().getSimpleName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Medium medium = (Medium) o;
        return Objects.equals(title, medium.title) &&
                Objects.equals(state, medium.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, state);
    }
}