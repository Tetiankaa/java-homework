package homework3.part2;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Guitar implements Instrument{

    private int numberOfStrings;

    @Override
    public void play() {
        System.out.println("Play guitar "+ "with " + this.numberOfStrings + " number of strings");
    }
}
