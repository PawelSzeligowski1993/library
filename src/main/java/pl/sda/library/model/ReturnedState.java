package pl.sda.library.model;

import java.io.PrintStream;

class ReturnedState implements MediumState {

    private final PrintStream printStream;

    //Konstruktory parametrowe potrzebne sa do testów
    public ReturnedState() {
        this.printStream = System.out;
    }

    public ReturnedState(PrintStream printStream) {
        this.printStream = printStream;
    }

    @Override public MediumState borrowMedium(String firstName, String lastName) {
        BorrowedState borrowedState = new BorrowedState(printStream);
        borrowedState.setFirstName(firstName);
        borrowedState.setLastName(lastName);
        return borrowedState;
    }

    @Override public MediumState returnMedium() {
        printStream.println("Nie można zwrócić książki ponownie");
        return this;
    }

    @Override public String toString() {
        return "ReturnedState{}";
    }

}