
package pl.sda.library.command;

import pl.sda.library.model.Medium;
import java.io.PrintStream;
import java.util.Scanner;


interface CreateMultimediaStrategy {

    Medium createMedium(Scanner scanner, PrintStream printStream);
    boolean isTypeCorrect(String type);

}