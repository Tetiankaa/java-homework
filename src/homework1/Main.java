package homework1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //- закінчити опис класів Car,Dog,Book (файли знаходяться в цій папці)
        //створити 5 об'єктів класу, покласти в маисв/ліст, проітерувати та вивести в консоль

        // BOOK

        ArrayList<String> authorsForBook1 = new ArrayList<>();
        authorsForBook1.add("author1");
        authorsForBook1.add("author2");

        Book book1 = new Book("Book1",250,authorsForBook1,"discovery");

        ArrayList<String> authorsForBook2 = new ArrayList<>();
        authorsForBook2.add("author1");
        authorsForBook2.add("author2");
        authorsForBook2.add("author3");

        Book book2 = new Book("Book2",110,authorsForBook2,"fantasy");

        ArrayList<String> authorsForBook3 = new ArrayList<>();
        authorsForBook3.add("author1");
        authorsForBook3.add("author2");

        Book book3 = new Book("Book3",470,authorsForBook3,"romance");

        ArrayList<String> authorsForBook4 = new ArrayList<>();
        authorsForBook4.add("author1");
        authorsForBook4.add("author2");
        authorsForBook4.add("author3");

        Book book4 = new Book("Book4",235,authorsForBook4,"adventurous");

        ArrayList<String> authorsForBook5 = new ArrayList<>();
        authorsForBook5.add("author1");

        Book book5 = new Book("Book5",80,authorsForBook5,"mystery");

        ArrayList<Book> allBooks = new ArrayList<>();
        allBooks.add(book1);
        allBooks.add(book2);
        allBooks.add(book3);
        allBooks.add(book4);
        allBooks.add(book5);

        for (Book book : allBooks){
            System.out.println("Title: " + book.getTitle() + ", pages: " + book.getPages() + ", authors: " + book.getAuthors() + ", genre: " + book.getGenre());
        }

        // DOG

        Dog dog1 = new Dog();
        dog1.setName("dog1");
        dog1.setAge(2);
        dog1.setSpecie("bulldog");

        Dog dog2 = new Dog();
        dog2.setName("dog2");
        dog2.setAge(6);
        dog2.setSpecie("beagle");

        Dog dog3 = new Dog();
        dog3.setName("dog3");
        dog3.setAge(4);
        dog3.setSpecie("poodle");

        Dog dog4 = new Dog();
        dog4.setName("dog4");
        dog4.setAge(9);
        dog4.setSpecie("boxer");

        Dog dog5 = new Dog();
        dog5.setName("dog5");
        dog5.setAge(5);
        dog5.setSpecie("labrador");

        ArrayList<Dog> allDogs = new ArrayList<>();
        allDogs.add(dog1);
        allDogs.add(dog2);
        allDogs.add(dog3);
        allDogs.add(dog4);
        allDogs.add(dog5);

        for (Dog dog : allDogs){
            System.out.println("Name: " + dog.getName() + ", age: " + dog.getAge() + ", specie: " + dog.getSpecie());
        }

        // CAR

        Car car1 = new Car("Toyota", 180.5, 2500, 0.0);
        Car car2 = new Car("Ford Mustang", 450.0, 5000, 0.2);
        Car car3 = new Car("Honda", 150.0, 2000, 0.0);
        Car car4 = new Car("Tesla", 500.0, 0, 0.5);
        Car car5 = new Car("BMW", 425.0, 3000, 0.3);

        ArrayList<Car> allCars = new ArrayList<>();
        allCars.add(car1);
        allCars.add(car2);
        allCars.add(car3);
        allCars.add(car4);
        allCars.add(car5);

        for (Car car : allCars){
            System.out.println("Model: " + car.getModel() + ", power: " + car.getPower() + ", volume: " + car.getVolumeEngine() + ", turbo: " + car.getTurbo());
        }

        // POST

        Post post1 = new Post(1,18,"sunt aut facere repellat provident occaecati excepturi optio reprehenderit","quia et suscipitsuscipit recusandae consequuntur expedita et cureprehenderit molestiae ut ut quas toostrum rerum est autem sunt rem eveniet architecto");
        Post post2 = new Post(2,11,"eum et est occaecati","dolore placeat quibusdam ea quo vitaemagni quis enim qui quis quo nemo aut saepequidem repellat excepturi ut quisunt ut sequi eos ea sed quas");
        Post post3 = new Post(3,22,"nesciunt quas odio","dignissimos aperiam dolorem qui eumacilis quibusdam animi sint suscipit qui sint possimus cumquaerat magni maiores excepturipsam ut commodi dolor voluptatum modi aut vitae");
        Post post4 = new Post(4,55,"magnam facilis autem","quia et suscipisuscipit recusandae consequuntur expedita et");
        Post post5 = new Post(5,101,"dolorem dolore est ipsam","quo et expedita modi cum officia vel magnidoloribus qui repudiandaevero nisi sit veniam quod sed accusamus veritatis error");

        ArrayList<Post> allPosts = new ArrayList<>();
        allPosts.add(post1);
        allPosts.add(post2);
        allPosts.add(post3);
        allPosts.add(post4);
        allPosts.add(post5);

        for (Post post : allPosts){
            System.out.println("userId: " + post.getUserId() + ", id: " + post.getId() + ", title: " + post.getTitle() + ", body: " + post.getBody());
        }

        // COMMENT

        Comment comment1 = new Comment();
        comment1.setPostId(1);
        comment1.setId(1);
        comment1.setName("name1");
        comment1.setEmail("Eliseo@gardner.biz");
        comment1.setBody("laudantium enim quasi est quidem magnam voluptate ipsam eostempora quo necessitatibusdolor quam autem quasireiciendis et nam sapiente accusantium");

        Comment comment2 = new Comment();
        comment2.setPostId(1);
        comment2.setId(2);
        comment2.setEmail("Jayne_Kuhic@sydney.com");
        comment2.setName("name2");
        comment2.setBody("quia molestiae reprehenderit quasi aspernaturaut expedita occaecati aliquam eveniet");

        Comment comment3 = new Comment();
        comment3.setPostId(1);
        comment3.setId(3);
        comment3.setName("name3");
        comment3.setEmail("Lew@alysha.tv");
        comment3.setBody("harum non quasi et rationempore iure ex voluptates in ratioarum architecto fugit inventore cupiditatluptates magni quo et");

        ArrayList<Comment> allComments = new ArrayList<>();
        allComments.add(comment1);
        allComments.add(comment2);
        allComments.add(comment3);

        for (Comment comment : allComments){
            System.out.println("postId: " + comment.getPostId() + ", id: " + comment.getId() + ", name: " + comment.getName() + ", email: " + comment.getEmail() + ", body: " + comment.getBody());
        }

    }
}
