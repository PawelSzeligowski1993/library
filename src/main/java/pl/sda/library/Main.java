package pl.sda.library;

import pl.sda.library.model.Book;
import pl.sda.library.model.BookBuilder;
import pl.sda.library.model.Library;

public class Main {
    public static void main(String[] args) {
        System.out.println("Program działa");

        Library library = new Library();
        library.addBook(new BookBuilder().authorFirstName("Carol").authorLastName("Lewis").title("Lew, czarownica i stara szafa").build());
        library.addBook(new BookBuilder().authorFirstName("Luis").authorLastName("Carol").title("Alicja w krainie czarów").build());
        library.addBook(new BookBuilder().authorFirstName("Agata").authorLastName("Christie").title("I nie było już nikogo").build());
        library.addBook(new BookBuilder().authorFirstName("Agata").authorLastName("Christie").title("I nie było już nikogo").build());
        library.addBook(new BookBuilder().authorFirstName("Agata").authorLastName("Christie").title("I nie było już nikogo").build());
        library.addBook(new BookBuilder().authorFirstName("Agata").authorLastName("Christie").title("I nie było już nikogo").build());
        library.addBook(new BookBuilder().authorFirstName("Agata").authorLastName("Christie").title("I nie było już nikogo").build());
        library.addBook(new BookBuilder().authorFirstName("Agata").authorLastName("Christie").title("I nie było już nikogo").build());
        library.addBook(new BookBuilder().authorFirstName("Agata").authorLastName("Christie").title("I nie było już nikogo").build());
        library.addBook(new BookBuilder().authorFirstName("Agata").authorLastName("Christie").title("I nie było już nikogo").build());
        library.addBook(new BookBuilder().authorFirstName("Agata").authorLastName("Christie").title("I nie było już nikogo").build());
        library.addBook(new BookBuilder().authorFirstName("Agata").authorLastName("Christie").title("I nie było już nikogo").build());
        library.addBook(new BookBuilder().authorFirstName("Xueqin").authorLastName("Cao").title("Sen czerwonego pawilonu").build());
        //library.addBook();

        for(Book book: library.getBooks()){
            System.out.println(book);
        }

    }
}
