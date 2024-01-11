package homework3.part2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Instrument> instruments = new ArrayList<>();

        Instrument guitar = new Guitar(6);
        Instrument drum = new Drum(18);
        Instrument trumpet = new Trumpet(460);

        instruments.add(guitar);
        instruments.add(drum);
        instruments.add(trumpet);

        for (Instrument instrument : instruments){
            instrument.play();
        }

    }
}
