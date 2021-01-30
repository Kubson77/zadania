package zadanie19;

public class Poem extends Author {
    private final int stropheNumbers;

    Poem(String surname, String nationality, int stropheNumbers) {
        super(surname, nationality);
        this.stropheNumbers = stropheNumbers;
    }

    public int getStropheNumbers() {
        return stropheNumbers;
    }
}
