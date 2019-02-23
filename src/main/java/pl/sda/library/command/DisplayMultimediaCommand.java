package pl.sda.library.command;

import pl.sda.library.model.Library;
import pl.sda.library.model.Medium;

import java.io.PrintStream;

public class DisplayMultimediaCommand implements Command{

    private final Library<Medium> library;
    private final PrintStream printStream;

    public DisplayMultimediaCommand(Library<Medium> library, PrintStream printStream) {
        this.library = library;
        this.printStream = printStream;
    }

    @Override
    public void execute() {
        library.getMedia().forEach(printStream::println);
    }


}
