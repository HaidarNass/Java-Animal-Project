import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private List<Animal> animals;

    public Zoo(){
        animals = new ArrayList<>();
    }

    public void addAnimals(Animal animal){
        animals.add(animal);
    }

    public void feedAllAnimals(){
        if (animals.isEmpty()){
            System.out.println("There is no animals to feed");
        }
        else{
            for(Animal animal:animals){
                if (animal instanceof FeedingBehavior){
                    ((FeedingBehavior) animal).feed();
                }
            }
        }
    }

    public void makeAllAnimalSounds(){
        if(animals.isEmpty()){
            System.out.println("The zoo is emppty!");
        }else{
            for(Animal animal : animals){
                animal.makeSound();
            }
        }
    }

    public void displayAnimalReport(){
        if(animals.isEmpty()){
            System.out.println("There is no animals in the zoo");
        }else{
            for(Animal animal:animals){
                String feedingBehavior;
                if(animal instanceof Lion){
                    feedingBehavior = "CarnivoreFeeding";
                } else if (animal instanceof Elephant || animal instanceof Monkey) {
                    feedingBehavior = "HerbivoreFeeding";
                } else {
                    feedingBehavior="Unknown";
                }
                System.out.println(animal.getName() + "-Species: "
                        + animal.getName() +" ,Feeding: "
                        +feedingBehavior+", Sound: ");
                animal.makeSound();
            }
        }
    }
}
