package homework4.part2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Objects;

@Data
@AllArgsConstructor
public class User {
    private int id;
    private String name;
    private String surname;
    private String email;
    private int age;
    private Gender gender;
    private ArrayList<Skills> skills;
    private Car car;


}
