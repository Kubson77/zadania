package zadanie19;

public class Main {
    public static void main(String[] args) {
        Poem poem1 = new Poem("Baczyński", "polak", 75);
        Poem poem2 = new Poem("Twardowski", "polak", 45);
        Poem poem3 = new Poem("Herbert", "polak", 154);

        Poem[] table = {poem1, poem2, poem3};
        Poem temp = poem1;

        for (int i = 0; i < table.length - 1; i++) {
            for (int j = i + 1; j < table.length; j++) {
                if (table[i].getStropheNumbers() > table[j].getStropheNumbers() && temp.getStropheNumbers() < table[j].getStropheNumbers()) {
                    temp = table[i];
                } else if (temp.getStropheNumbers() < table[j].getStropheNumbers()) {
                    temp = table[j];
                }
            }
        }
        int counter = 0;
        for(var x: table) {
            if(x.getStropheNumbers() == temp.getStropheNumbers()) {
                counter++;
            }
        }
        if (counter > 1) {
            System.out.println("Kilku autorów napisało taką samą liczbę zwrotek:");
            for(var x: table) {
                if(x.getStropheNumbers() == temp.getStropheNumbers()) {
                    System.out.println(x.getName());
                }
            }
        } else {
            System.out.println("Autor, który napisał największą liczbę zwrotek: " + temp.getName());
        }

    }
}
