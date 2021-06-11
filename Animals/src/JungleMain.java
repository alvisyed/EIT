import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JungleMain {

        public static void main(String []args){
// List of animal in the Jungle
            List<Animal> animalList = new ArrayList<Animal>();
// Creating an Animals object
            Tiger tiger1 = new Tiger();
            Monkey monkey1 = new Monkey();
// Adding new Tiger object to the animalList
            animalList.add(tiger1);
// Random activities
            randomActivity(animalList);
    System.out.println("Tiger count: " + tiger1.getAnimalCount());
    System.out.println("Monkey1 energy level: " + monkey1.getEnergyLevel());
    monkey1.makeSound();
    monkey1.play();
    monkey1.eatFood();
    monkey1.play();
    System.out.println("Monkey1 energy level: " + monkey1.getEnergyLevel());
    soundOff(animalList);System.out.println("Tiger1 energy level: " + tiger1.getEnergyLevel());
    tiger1.eatFood(new Meat());
    System.out.println("Tiger1 energy level: " + tiger1.getEnergyLevel());
        }
        public static void randomActivity(List<Animal> animalList){
            Random rand = new Random();
            for(Animal animal: animalList){
                int rand_int1 = rand.nextInt(3);
                if(rand_int1 == 0)
                    animal.makeSound();
                else if (rand_int1 == 1){
                    animal.eatFood();
                }else
                    animal.goToSleep();
            }
        }
        public static void soundOff(List<Animal> animalList){
            System.out.println("Sound off");
            for(Animal animal : animalList){
                animal.makeSound();
            }
        }
    }



