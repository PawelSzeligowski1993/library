package pl.sda.library;

import pl.sda.library.model.*;
import pl.sda.library.command.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Program działa");

//        Library<Book> library = new Library<>();
        Library<Medium> library = new Library<>();
        Scanner scanner = new Scanner(System.in);
//        Library<PaperBook> library1 = new Library<>();
//        Library<AudioBook> library2= new Library<>();
        createLibrary(library);

        Map<String, Command> commands =new HashMap<>();
        commands.put("exit", ()-> System.exit(0));// zamykanie programu po przez wpisanie komendy 0
        commands.put("display", new DisplayMultimediaCommand(library, System.out));

        //TODO
        while (true){
            System.out.println("Podaj komendę");
            String commandName = scanner.nextLine();
            Command command = commands.get(commandName);
            Optional.ofNullable(command).ifPresent(Command::execute);
        }

        // komenda wyswietlenia wszystkiego


//        }

    }

    private static void createLibrary(Library<Medium> library) {
        library.addMedium(new PaperBookBuilder()//
                .authorFirstName("Carol")//
                .authorLastName("Lewis")//
                .title("Lew, czarownica i stara szafa")//
                .cover(Cover.HARD)
                .build());
        library.addMedium(new PaperBookBuilder()//
                .authorFirstName("Lewis")//
                .authorLastName("Carol")//
                .title("Alicja w Krainie Czarów")//
                .build());
        library.addMedium(new PaperBookBuilder()//
                .authorFirstName("Xueqin")//
                .authorLastName("Cao")//
                .title("Sen czerwonego pawilonu")//
                .build());
        library.addMedium(new PaperBookBuilder()//
                .authorFirstName("Agatha")//
                .authorLastName("Christie")//
                .title("I nie było już nikogo")//
                .build());
        library.addMedium(new PaperBookBuilder()//
                .authorFirstName("John")//
                .authorLastName("Tolkien")//
                .title("Hobbit, czyli tam i z powrotem")//
                .build());
        library.addMedium(new PaperBookBuilder()//
                .authorFirstName("Joanne")//
                .authorLastName("Rowling")//
                .title("Harry Potter i kamień filozoficzny")//
                .build());
        library.addMedium(new PaperBookBuilder()//
                .authorFirstName("Antoine")//
                .authorLastName("de Saint-Exupéry")//
                .title("Mały Książę")//
                .build());
        library.addMedium(new PaperBookBuilder()//
                .authorFirstName("John")//
                .authorLastName("Tolkien")//
                .title("Władca Pierścieni")//
                .build());
        library.addMedium(new PaperBookBuilder()//
                .authorFirstName("Charles")//
                .authorLastName("Dickens")//
                .title("Opowieść o dwóch miastach")//
                .build());
        library.addMedium(new PaperBookBuilder()//
                .authorFirstName("Miguel")//
                .authorLastName("de Cervantes")//
                .title("Don Kichot")//
                .build());
        // ----------- Audio Book
        library.addMedium(new AudioBookBuilder()//
                .authorFirstName("Carol")//
                .authorLastName("Lewis")//
                .title("Lew, czarownica i stara szafa")//
                .build());
        library.addMedium(new AudioBookBuilder()//
                .authorFirstName("Lewis")//
                .authorLastName("Carol")//
                .title("Alicja w Krainie Czarów")//
                .build());
        library.addMedium(new AudioBookBuilder()//
                .authorFirstName("Xueqin")//
                .authorLastName("Cao")//
                .title("Sen czerwonego pawilonu")//
                .build());
        library.addMedium(new AudioBookBuilder()//
                .authorFirstName("Agatha")//
                .authorLastName("Christie")//
                .title("I nie było już nikogo")//
                .build());
        library.addMedium(new AudioBookBuilder()//
                .authorFirstName("John")//
                .authorLastName("Tolkien")//
                .title("Hobbit, czyli tam i z powrotem")//
                .build());
        library.addMedium(new AudioBookBuilder()//
                .authorFirstName("Joanne")//
                .authorLastName("Rowling")//
                .title("Harry Potter i kamień filozoficzny")//
                .build());
        library.addMedium(new AudioBookBuilder()//
                .authorFirstName("Antoine")//
                .authorLastName("de Saint-Exupéry")//
                .title("Mały Książę")//
                .build());
        library.addMedium(new AudioBookBuilder()//
                .authorFirstName("John")//
                .authorLastName("Tolkien")//
                .title("Władca Pierścieni")//
                .build());
        library.addMedium(new AudioBookBuilder()//
                .authorFirstName("Charles")//
                .authorLastName("Dickens")//
                .title("Opowieść o dwóch miastach")//
                .build());
        library.addMedium(new AudioBookBuilder()//
                .authorFirstName("Miguel")//
                .authorLastName("de Cervantes")//
                .title("Don Kichot")//
                .build());
//-------------Czasopisma----------------------------

        library.addMedium(new MagazineBuilder()//
                .title("Motor")//
                .number(15)//
                .pageCount(32)//
                .build());
        library.addMedium(new MagazineBuilder()//
                .title("Newsweek")//
                .number(14)//
                .pageCount(64)//
                .build());
        library.addMedium(new MagazineBuilder()//
                .title("Polityka")//
                .number(13)//
                .pageCount(100)//
                .build());
        library.addMedium(new MovieBuilder()//
                .title("Skazani na Shawshank")//
                .directorFirstName("Frank")//
                .directorLastName("Darabont")//
                .duration(120)//
                .build());
        library.addMedium(new MovieBuilder()//
                .title("Zielona mila")//
                .directorFirstName("Frank")//
                .directorLastName("Darabont")//
                .duration(180)//
                .build());
        library.addMedium(new MovieBuilder()//
                .title("Nietykalni")//
                .directorFirstName("Olivier")//
                .directorLastName("Nakache")//
                .duration(110)//
                .build());


        library.getMedia().forEach(System.out::println);//3
// 2       library.getMedia().forEach(medium -> System.out.println(medium));
//  1      for(Medium medium: library.getMedia()){
//            System.out.println(medium);
    }
}
