package pl.sda.library.model;

public enum Cover {
    SOFT("Miekka"),HARD("Twarda");
    private String name;

    Cover (String name) {this.name = name;}

    public String getName(){return name;}
}
