package homework1;

public class Dog {
    private String name;
    private int age;
    private String specie;

    public Dog(String name, int age, String specie){
        this.name = name;
        this.age = age;
        this.specie = specie;
    }
    public Dog(){}

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public String getSpecie(){
        return this.specie;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setSpecie(String specie){
        this.specie = specie;
    }
}
