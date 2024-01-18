package homework5.part1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        //створити ArrayList зі словами на 15-20 елементів.
        ArrayList<String> strings = new ArrayList<>();
        strings.add("dictionary");
        strings.add("fish");
        strings.add("architecture");
        strings.add("orbit");
        strings.add("shock");
        strings.add("advance");
        strings.add("shallow");
        strings.add("allow");
        strings.add("castle");
        strings.add("leaf");
        strings.add("have");
        strings.add("stereotype");
        strings.add("mix");
        strings.add("equip");
        strings.add("rib");
        strings.add("business");
        strings.add("tough");

        //- відсортувати його за алфавітом .

        strings
                .stream()
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);

    //*-- відфільтрувати слова довжиною менше 4 символів

        strings
                .stream()
                .filter(s -> s.length() < 4)
                .forEach(System.out::println);

        // - Створити масив з 20 числами.

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(25);
        numbers.add(165);
        numbers.add(654);
        numbers.add(54616);
        numbers.add(54);
        numbers.add(546);
        numbers.add(298);
        numbers.add(500);
        numbers.add(98);
        numbers.add(56);
        numbers.add(86);
        numbers.add(7458);
        numbers.add(65);
        numbers.add(98);
        numbers.add(13);
        numbers.add(564);
        numbers.add(879);
        numbers.add(46);
        numbers.add(78694);
        numbers.add(77);

        //- за допомогою способу sorted відсортувати масив.
        numbers
                .stream()
                .sorted()
                .forEach(System.out::println);

        //-- за допомогою filter отримати числа кратні 3
        numbers
                .stream()
                .filter(n-> n % 3 == 0)
                .forEach(System.out::println);

        //-- за допомогою filter отримати числа кратні 10
        numbers
                .stream()
                .filter(n-> n % 10 == 0)
                .forEach(System.out::println);

       //-- перебрати (проітерувати) масив за допомогою foreach()
        numbers.forEach(System.out::println);

        //-- перебрати масив за допомогою map() і отримати новий масив, в якому всі значення будуть у 3 рази більші
        ArrayList<Integer> numbers2 = numbers
                .stream()
                .map(n-> n * 3)
                .collect(Collectors.toCollection(ArrayList::new));

        numbers2.forEach(System.out::println);
    }
}
