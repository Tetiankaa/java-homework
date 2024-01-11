package homework3.part2;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Trumpet implements Instrument{

    private int diameter;


    @Override
    public void play() {
        System.out.println("Play trumpet with diameter " + this.diameter);
    }
}
