
package pl.sda.library.command;

import pl.sda.library.model.Library;
import pl.sda.library.model.Medium;



import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;



public class CreateMultimediaCommand implements Command {


    private final Library<Medium> library;
    private final PrintStream printStream;
    private final List<CreateMultimediaStrategy> strategies = Arrays.asList(//
            new CreateAudioBookCommandStrategy(),//
            new CreatePaperBookCommandStrategy());


    public CreateMultimediaCommand(Library<Medium> library, PrintStream printStream) {
        this.library = library;
        this.printStream = printStream;
    }



    @Override public void execute() {
        Scanner scanner = new Scanner(System.in);
        printStream.println("Typ:");
        String type = scanner.nextLine();
        Optional<Medium> medium = strategies.stream()//
                .filter(s -> s.isTypeCorrect(type))//
                .findFirst()//
                .map(s -> s.createMedium(scanner, printStream));
        medium.ifPresent(m -> library.addMedium(m));
    }
}