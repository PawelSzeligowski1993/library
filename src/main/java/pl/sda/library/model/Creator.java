package pl.sda.library.model;



import java.util.Objects;



public class Creator {



    private String firstName;

    private String lastName;



    Creator() {

    }



    public String getFirstName() {

        return firstName;

    }



    public void setFirstName(String firstName) {

        this.firstName = firstName;

    }



    public String getLastName() {

        return lastName;

    }



    public void setLastName(String lastName) {

        this.lastName = lastName;

    }



    @Override public boolean equals(Object o) {

        if (this == o) {

            return true;

        }

        if (o == null || getClass() != o.getClass()) {

            return false;

        }

        Creator author = (Creator) o;

        return Objects.equals(firstName, author.firstName)//

                && Objects.equals(lastName, author.lastName);

    }



    @Override public int hashCode() {

        return Objects.hash(firstName, lastName);

    }



    @Override public String toString() {

        return "Creator{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + '}';

    }



}