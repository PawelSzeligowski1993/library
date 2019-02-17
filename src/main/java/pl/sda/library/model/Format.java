package pl.sda.library.model;

public enum Format {
    MP3("MP3"),FLAC("FLAC");
    private String name;

    Format (String name){this.name = name;}

    public String getName(){return name;}
}



