package homework4.part2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //Використати композицію/агрегацію та енуми в потрібному місці.
        //Створити HashSet з 10 об'єктів, проітерувати її, видалити всіх чоловіків

        HashSet<User> userHashSet = new HashSet<>();

        userHashSet.add(new User(1,"Mariyah ","Peterson","email",30,Gender.MALE,
                new ArrayList<>(Arrays.asList(new Skills(Skill.JAVA,2),new Skills(Skill.ANGULAR,2))),
                new Car("toyota",2021,250)));

        userHashSet.add(new User(2,"Neha ","Moreno","emasil",35,Gender.MALE,
                new ArrayList<>(Arrays.asList(new Skills(Skill.CPP,5),new Skills(Skill.CSS,6),new Skills(Skill.JS,5))),
                new Car("hyndai",2023,200)));

        userHashSet.add(new User(3,"Kylie ","Cantrell","emasil",49,Gender.FEMALE,
                new ArrayList<>(Arrays.asList(new Skills(Skill.CSS,1))),
                new Car("bmw",2018,240)));

        userHashSet.add(new User(4,"Harmony ","Osborne","emasil",41,Gender.MALE,
                new ArrayList<>(Arrays.asList(new Skills(Skill.JS,3),new Skills(Skill.CSS,3))),
                new Car("toyota",2021,250)));

        userHashSet.add(new User(5,"Tina ","Humphrey","emasil",19,Gender.FEMALE,
                new ArrayList<>(Arrays.asList(new Skills(Skill.CSS,7),new Skills(Skill.JS,5),new Skills(Skill.JAVA,6),new Skills(Skill.ANGULAR,7))),
                new Car("opel",2020,250)));

        userHashSet.add(new User(6,"Zaid ","Daniel","emasil",22,Gender.FEMALE,
                new ArrayList<>(Arrays.asList(new Skills(Skill.CSS,1),new Skills(Skill.JS,2))),
                new Car("audi",2023,300)));

        userHashSet.add(new User(7,"Dean ","Brown","emasil",39,Gender.MALE,
                new ArrayList<>(Arrays.asList(new Skills(Skill.JS,4),new Skills(Skill.REACT,3),new Skills(Skill.ANGULAR,2))),
                new Car("bmw",2025,200)));

        userHashSet.add(new User(8,"Erika ","Bush","emasil",54,Gender.MALE,
                new ArrayList<>(Arrays.asList(new Skills(Skill.REACT,2))),
                new Car("toyota",2021,250)));

        userHashSet.add(new User(9,"Olivia ","Randall","emasil",29,Gender.FEMALE,
                new ArrayList<>(Arrays.asList(new Skills(Skill.CSS,6),new Skills(Skill.JS,6),new Skills(Skill.REACT,4),new Skills(Skill.ANGULAR,3),new Skills(Skill.JAVA,1))),
                new Car("hyndai",2022,250)));

        userHashSet.add(new User(10,"Mildred ","Proctor","emasil",40,Gender.MALE,
                new ArrayList<>(Arrays.asList(new Skills(Skill.CPP,3),new Skills(Skill.JS,2),new Skills(Skill.JAVA,5),new Skills(Skill.ANGULAR,2))),
                new Car("toyota",2021,250)));

//        userHashSet.forEach(System.out::println);

            userHashSet.removeIf(user -> user.getGender().equals(Gender.MALE));

//        userHashSet.forEach(System.out::println);

            // or by using stream
           HashSet<User> filteredWomen = userHashSet
                   .stream()
                   .filter(user -> user.getGender() != Gender.MALE)
                   .collect(Collectors.toCollection(()-> new HashSet<>()));

//        filteredWomen.forEach(System.out::println);

       // Створити TreeSet з 10 об'єктів, посортовану за кількістю скілів від меньшого до більшого

       TreeSet<User> userTreeSet = new TreeSet<>(Comparator.comparing((User user)->user.getSkills().size()).thenComparingInt(value -> value.getId()));

        userTreeSet.add(new User(1511,"Mariyah ","Peterson","email",30,Gender.MALE,
                new ArrayList<>(Arrays.asList(new Skills(Skill.JAVA,2),new Skills(Skill.ANGULAR,2))),
                new Car("toyota",2021,250)));

        userTreeSet.add(new User(121,"Neha ","Moreno","emasil",35,Gender.MALE,
                new ArrayList<>(Arrays.asList(new Skills(Skill.CPP,5),new Skills(Skill.CSS,6),new Skills(Skill.JS,5))),
                new Car("hyndai",2023,200)));

        userTreeSet.add(new User(153,"Kylie ","Cantrell","emasil",49,Gender.FEMALE,
                new ArrayList<>(Arrays.asList(new Skills(Skill.CSS,1))),
                new Car("bmw",2018,240)));

        userTreeSet.add(new User(14,"Harmony ","Osborne","emasil",41,Gender.MALE,
                new ArrayList<>(Arrays.asList(new Skills(Skill.JS,3),new Skills(Skill.CSS,3))),
                new Car("toyota",2021,250)));

        userTreeSet.add(new User(15216,"Tina ","Humphrey","emasil",19,Gender.FEMALE,
                new ArrayList<>(Arrays.asList(new Skills(Skill.CSS,7),new Skills(Skill.JS,5),new Skills(Skill.JAVA,6),new Skills(Skill.ANGULAR,7))),
                new Car("opel",2020,250)));

        userTreeSet.add(new User(1066,"Zaid ","Daniel","emasil",22,Gender.FEMALE,
                new ArrayList<>(Arrays.asList(new Skills(Skill.CSS,1),new Skills(Skill.JS,2))),
                new Car("audi",2023,300)));

        userTreeSet.add(new User(17865,"Dean ","Brown","emasil",39,Gender.MALE,
                new ArrayList<>(Arrays.asList(new Skills(Skill.JS,4),new Skills(Skill.REACT,3),new Skills(Skill.ANGULAR,2))),
                new Car("bmw",2025,200)));

        userTreeSet.add(new User(189,"Erika ","Bush","emasil",54,Gender.MALE,
                new ArrayList<>(Arrays.asList(new Skills(Skill.REACT,2))),
                new Car("toyota",2021,250)));

        userTreeSet.add(new User(191,"Olivia ","Randall","emasil",29,Gender.FEMALE,
                new ArrayList<>(Arrays.asList(new Skills(Skill.CSS,6),new Skills(Skill.JS,6),new Skills(Skill.REACT,4),new Skills(Skill.ANGULAR,3),new Skills(Skill.JAVA,1))),
                new Car("hyndai",2022,250)));

        userTreeSet.add(new User(2550,"Mildred ","Proctor","emasil",40,Gender.MALE,
                new ArrayList<>(Arrays.asList(new Skills(Skill.CPP,3),new Skills(Skill.JS,2),new Skills(Skill.JAVA,5),new Skills(Skill.ANGULAR,2))),
                new Car("toyota",2021,250)));


        userTreeSet.forEach(System.out::println);


    }
}
