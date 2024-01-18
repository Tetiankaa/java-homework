package homework5.part2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Owner {
    private String fullName;
    private int age;
    private int experience;

    public void goToTrainingCourses(){
            experience += 1;
    }
}
