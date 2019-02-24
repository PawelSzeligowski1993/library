package pl.sda.library;
import pl.sda.library.command.Command;

import pl.sda.library.command.CreateMultimediaCommand;

import pl.sda.library.command.DisplayMultimediaCommand;

import pl.sda.library.command.FilterByTypeCommand;

import pl.sda.library.model.AudioBookBuilder;

import pl.sda.library.model.Cover;

import pl.sda.library.model.Format;

import pl.sda.library.model.Library;

import pl.sda.library.model.MagazineBuilder;

import pl.sda.library.model.Medium;

import pl.sda.library.model.MovieBuilder;

import pl.sda.library.model.PaperBookBuilder;



import java.util.HashMap;

import java.util.Map;

import java.util.Optional;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Library<Medium> library = new Library<>();
        Scanner scanner = new Scanner(System.in);
        Map<String, Command> commands = new HashMap<>();
        commands.put("exit", () -> System.exit(0));
        commands.put("display", new DisplayMultimediaCommand(library, System.out));
        commands.put("filter", new FilterByTypeCommand(library, System.out));
        commands.put("create", new CreateMultimediaCommand(library, System.out));
        while (true) {
            System.out.println("Podaj komendę:");
            String commandName = scanner.nextLine();
            Command command = commands.get(commandName);
            Optional.ofNullable(command).ifPresent(Command::execute);
        }
    }


    private static Library<Medium> createLibrary() {
        Library<Medium> library = new Library<>();
        library.addMedium(new PaperBookBuilder()//
                .authorFirstName("Carol")//
                .authorLastName("Lewis")//
                .title("Lew, czarownica i stara szafa")//
                .cover(Cover.HARD)//
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
        library.addMedium(new AudioBookBuilder()//
                .authorFirstName("Carol")//
                .authorLastName("Lewis")//
                .title("Lew, czarownica i stara szafa")//
                .format(Format.FLAC)//
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
        return library;
    }
}
