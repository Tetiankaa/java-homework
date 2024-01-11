package homework3.part1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Printable> printableArray = new ArrayList<>();

        Printable book = new Book();
        Printable magazine = new Magazine();

       printableArray.add(book);
       printableArray.add(magazine);

       for (Printable item : printableArray){
             item.print();
       }
    }
}
