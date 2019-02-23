package pl.sda.library.model;

public class MagazineBuilder {
    private String title;
    private int number;
    private int pageCount;

    public MagazineBuilder title(String title){
        this.title = title;
        return this;
    }

    public MagazineBuilder number(int number){
        this.number = number;
        return this;
    }

    public MagazineBuilder pageCount(int pageCount){
        this.pageCount = pageCount;
        return this;
    }

    public Magazine build(){
        //TODO
        Magazine magazine = new Magazine();
        magazine.setTitle(title);
        magazine.setNumber(number);
        magazine.setPageCount(pageCount);
        return magazine;
    }
}
