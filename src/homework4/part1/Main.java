package homework4.part1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Створити List Юзерів
        //- відсортувати  за  віком (зростання , а потім окремо спадання за допомоги методу sort)
        //- відсортувати його за кількістю знаків в імені  (зростання , а потім окремо спадання)

        List<User> users = new ArrayList<>();
        users.add(new User(25,"RajMajhi"));
        users.add(new User(19,"John"));
        users.add(new User(58,"PushpaRai"));
        users.add(new User(35,"Gustavo"));
        users.add(new User(14,"KennethLima"));
        users.add(new User(55,"Jennifer"));
        users.add(new User(12,"AlanYılmaz"));

        users.sort((a,b)->a.getAge()-b.getAge());
        users.sort((a,b)->b.getAge()-a.getAge());
        users.sort((a,b)->a.getName().length()-b.getName().length());
        users.sort((a,b)->b.getName().length()-a.getName().length());


        //створити ArrayList зі словами на 15-20 елементів.
        //- відсортувати його за алфавітом .

        ArrayList<String> items = new ArrayList<>();
        items.add("Telluscurabitur");
        items.add("Dictumstbibendum");
        items.add("Enimnunc");
        items.add("Crasdictum");
        items.add("Justonisl");
        items.add("Inceptoseleifend");
        items.add("Anteullamcorper");
        items.add("Hacpretium");
        items.add("Ridiculusaliquet");
        items.add("Aturna");
        items.add("Iaculismaecenas");
        items.add("Curabiturefficitur");
        items.add("Posuerefacilisis");
        items.add("Convallisbibendum");
        items.add("fgloksdoij");
        items.add("Phasellusclass");
        items.add("Magnisultricies");
        items.add("Olesuadaultricies");

        items.sort(((o1, o2) -> o1.compareTo(o2)));
        items.sort(((o1, o2) -> o2.compareTo(o1)));
        System.out.println(items);


    }
}
