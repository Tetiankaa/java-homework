package homework2.taskFour;

import lombok.Data;

import java.util.ArrayList;

@Data
public class User {
    private int id;
    private String name;
    private String surname;
    private String email;
    private int age;
    private Gender gender;
    private ArrayList<Skills> skills;
    private Car car;

    //composition
    public void addSkills(Skill title, int exp){
        Skills skill = new Skills();
        skill.setTitle(title);
        skill.setExp(exp);

        if (skills == null){
            skills = new ArrayList<>();
        }
        skills.add(skill);
    }
}
