package homework4.part3_1;

public class Main {
    public static void main(String[] args) {

        ZooClub zooClub = new ZooClub();

        zooClub.addPerson(new Person("Tanya"));

        zooClub.addPet(new Pet("dog"),"Tanya");
        zooClub.addPet(new Pet("parrot"),"Tanya");
        zooClub.addPet(new Pet("cat"),"Tanya");

        zooClub.addPerson(new Person("Maks"));
        zooClub.addPet(new Pet("cat"),"Maks");

        zooClub.addPerson(new Person("Alina"));
        zooClub.addPet(new Pet("fish"),"Alina");
        zooClub.addPet(new Pet("cat"),"Alina");

        zooClub.deletePet("dog","Tanya");
        zooClub.deletePerson("Tanya");

        zooClub.deletePetFromEverywhere("cat");
        System.out.println(zooClub);
    }
}
