package pl.sda.library.model;

public abstract class BookBuilder<BookClass extends Book> {

    protected String authorFirstName;
    protected String authorLastName;
    protected String tiltle;

    public BookBuilder authorFirstName (String authorFirstName){
        this.authorFirstName = authorFirstName;
        return this;

    }

    public BookBuilder authorLastName(String authorLastName){
        this.authorLastName = authorLastName;
        return this;
    }

    public BookBuilder title(String tiltle) {
        this.tiltle = tiltle;
        return this;
    }

    public abstract BookBuilder getBookBuilderClass();


    public abstract BookClass build();

//    public Book build(){
//        Book book = new Book();
//        Author author =  new Author();
//        author.setFirstName(authorFirstName);
//        author.setLastName(authorLastName);
//        book.setAuthor(author);
//        book.setTitle(tiltle);
//        return book;
//    }


}
