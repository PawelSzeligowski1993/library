package pl.sda.library.model;

//interface domyslnie sa public

public interface MediumState {

    MediumState borrowMedium(String firstName, String lastName);

    MediumState returnMedium();
}
