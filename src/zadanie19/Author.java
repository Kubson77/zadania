package zadanie19;

public class Author {
    private final String surname;
    private final String nationality;

    Author(String surname, String nationality) {
        this.surname = surname;
        this.nationality = nationality;
    }

    public String getName() {
        return surname;
    }
}
