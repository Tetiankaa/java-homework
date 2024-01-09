package homework2.taskFour;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setModel("toyota");
        car1.setYear(2021);
        car1.setPower(250);

        User user = new User();
        user.setId(1);
        user.setName("vasya");
        user.setSurname("pupkin");
        user.setAge(31);
        user.setGender(Gender.MALE);
        user.addSkills(Skill.JAVA,4);
        user.addSkills(Skill.JS,8);
        user.setCar(car1);

        System.out.println(user);
    }
}
