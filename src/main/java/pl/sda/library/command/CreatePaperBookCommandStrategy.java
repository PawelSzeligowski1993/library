package pl.sda.library.command;



import pl.sda.library.model.Cover;

import pl.sda.library.model.Medium;

import pl.sda.library.model.PaperBookBuilder;



import java.io.PrintStream;

import java.util.Objects;

import java.util.Scanner;



class CreatePaperBookCommandStrategy implements CreateMultimediaStrategy {



    public static final String PAPER_BOOK = "PaperBook";



    @Override public Medium createMedium(Scanner scanner, PrintStream printStream) {

        printStream.println("Tytuł:");

        String title = scanner.nextLine();

        printStream.println("Imię autora:");

        String authorFirstName = scanner.nextLine();

        printStream.println("Nazwisko autora:");

        String authorLastName = scanner.nextLine();

        printStream.println("Okładka:");

        String cover = scanner.nextLine();

        printStream.println("Liczba stron:");

        int pageCount = scanner.nextInt();

        scanner.nextLine();

        return new PaperBookBuilder()//

                .title(title)//

                .authorFirstName(authorFirstName)//

                .authorLastName(authorLastName)//

                .cover(Cover.valueOf(cover))//

                .pageCount(pageCount)//

                .build();

    }



    @Override public boolean isTypeCorrect(String type) {

        return Objects.equals(type, PAPER_BOOK);

    }



}