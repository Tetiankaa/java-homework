package homework4.part3_2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ZooClub {
   private Map<Person,List<Pet>> club = new HashMap<>();

   static void checkPerson(Person person){
      if (person == null){
         throw  new RuntimeException();
      }
   }
   static void checkPet(Pet pet){
      if (pet == null){
         throw  new RuntimeException();
      }
   }
   public void addPersonToTheClub(Person person, List<Pet> pets){
      checkPerson(person);

      this.club.put(person,pets);
   }

   public void addPetToThePerson(Pet pet, Person person){
      checkPerson(person);
      checkPet(pet);

         this.club.get(person).add(pet);
   }

   public void deletePetFromPerson(Pet pet, Person person){
      checkPerson(person);
      checkPet(pet);

      this.club.get(person).remove(pet);
   }

   public void deletePersonFromClub(Person person){
      checkPerson(person);

      this.club.remove(person);
   }

   public void deletePetFromAnybody(Pet pet){
      checkPet(pet);

      Set<Map.Entry<Person, List<Pet>>> entries = this.club.entrySet();

      Iterator<Map.Entry<Person, List<Pet>>> iterator = entries.iterator();

      while (iterator.hasNext()){
         Map.Entry<Person, List<Pet>> next = iterator.next();
         List<Pet> pets = next.getValue();

         for (Pet pet1 : pets){
            if (pet1.equals(pet)){
               iterator.remove();
            }
         }
      }



   }
}
