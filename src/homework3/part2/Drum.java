package homework3.part2;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Drum implements Instrument{

    private int size;

    @Override
    public void play() {
        System.out.println("Play drum "+ "with size " + this.size);
    }
}
