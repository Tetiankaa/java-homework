package homework5.part2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car(1,"Toyota",301,new Owner("Booker Callahan",39,20),25000,2022));
        cars.add(new Car(2,"Ford Mustang",310,new Owner("Murray Jarvis",20,2),30000,2023));
        cars.add(new Car(3,"Honda",310,new Owner("Bryon Pineda",60,30),27500,2022));
        cars.add(new Car(4,"Chevrolet Camaro",455,new Owner("Dane Whitney",29,1),35000,2023));
        cars.add(new Car(5,"BMW ",255,new Owner("Eloy Shaw",44,12),40000,2022));
        cars.add(new Car(6,"Volkswagen",228,new Owner("Rolando Mays",49,15),28000,2023));
        cars.add(new Car(7,"Mercedes-Benz",255,new Owner("Jayne Cervantes",33,3),42000,2022));
        cars.add(new Car(8,"Subaru ",268,new Owner("Byron Wagner",29,5),29000,2023));
        cars.add(new Car(9,"Ford ",395,new Owner("Shad Gallegos",71,40),35000,2022));
        cars.add(new Car(10,"Tesla",283,new Owner("Faith Fletcher",45,8),42000,2022));
        cars.add(new Car(11,"Audi",261,new Owner("Burl Donaldson",38,1),38000,2022));
        cars.add(new Car(12,"Nissan ",248,new Owner("Brady Harrison",56,25),27000,2023));
        cars.add(new Car(13,"Jaguar",246,new Owner("Terence Mccann",63,29),50000,2022));
        cars.add(new Car(14,"Hyundai ",180,new Owner("Maximo Little",23,3),24000,2023));
        cars.add(new Car(15,"Porsche ",379,new Owner("Deon Tapia",39,4),95000,2022));

        //Зробили половині автопарку ремонт мотору, що збільшить потужність автомобілів на 10% (переприсвоєння змінної потужності).
        cars
            .stream()
            .filter(car -> car.getId() % 2 == 0)
            .forEach(Car::repairEngine);

    //Після того в масиві цих автівок зробити перевірку досвіду ВСІХ наших водіїв.
    //Якщо досвід водія менший за 5 років, але його вік більший за 25, то необідно відправити його на курси підвищення кваліфікації, що збільшить йому досвід на 1 рік

        cars
             .stream()
             .filter(car -> {
                Owner owner = car.getOwner();
                return owner.getExperience() < 5 && owner.getAge() > 25;
            })
             .forEach(car -> car.getOwner().goToTrainingCourses());

        cars.forEach(System.out::println);
//Також спробуйте порахувати суму, яку потрібно потратити для покупки всіх цих авто

       int carsCost =  cars
                    .stream()
                    .map(Car::getPrice)
                    .reduce(0, Integer::sum);

        System.out.println(carsCost);

    }
}
