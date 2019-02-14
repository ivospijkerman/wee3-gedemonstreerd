package nl.spijkerman.ivo.week3app;

public class Contact {
    final String firstName;
    final String lastName;


    public Contact(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
