package homework5.part2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    private int id;
    private String brand;
    private int power;
    private Owner owner;
    private int price;
    private int year;

    public void repairEngine(){
        this.power = (int) (this.power + (this.power * 0.1));
    }

}
