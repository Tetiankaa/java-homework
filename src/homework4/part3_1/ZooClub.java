package homework4.part3_1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ZooClub {
    private Map<Person, List<Pet>> club;

    public void addPerson(Person person){
        if (this.club == null){
            club = new HashMap<>();
        }
        this.club.put(person,null);
    }
    public void addPet(Pet pet, String person){
        for (Map.Entry<Person, List<Pet>> entries : club.entrySet()){
          if (entries.getKey().getName().equals(person)){
          List<Pet> pets = entries.getValue();
          if (pets == null){
              pets = new ArrayList<>();
              entries.setValue(pets);
          }
          pets.add(pet);
            return;
          }
        }
        System.out.println("Person with provided name wasn't found...");
    }

    public void deletePet(String petName, String personName){
        for (Map.Entry<Person, List<Pet>> entry : club.entrySet()){
            if (entry.getKey().getName().equals(personName)){
                List<Pet> pets =  entry.getValue();
                if (pets != null){
                    pets.removeIf(pet -> pet.getType().equals(petName));
                }
            }
        }
        System.out.println("No pets found for the person with the provided name.");
    }

    public void deletePerson(String personName){
        for (Map.Entry<Person, List<Pet>> entry : club.entrySet()){
            if (entry.getKey().getName().equals(personName)){
                this.club.remove(entry.getKey());
                return;
            }
        }
        System.out.println("Person with provided name wasn't found");
    }

    public void deletePetFromEverywhere(String petName){
        for (Map.Entry<Person, List<Pet>> entry : club.entrySet()){
         List<Pet> pets = entry.getValue();
         if (pets != null){
             pets.removeIf(pet -> pet.getType().equals(petName));
         }
        }
    }

}
