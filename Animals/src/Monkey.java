public class Monkey extends Animal {

        Monkey() {
            incrementAnimalCount();
        }


        public void goToSleep() {
            energy = energy + 5;
        }


        public void makeSound() {
            System.out.println("Monkey sound");
            energy = energy - 4;
        }


        public void eatFood() {
            energy = energy + 2;
        }

        public void play() {
            if (energy >= 8) {
                System.out.println("Oooo Oooo Oooo");
            } else {
                System.out.println("Monkey is too tired");
            }

        }
    }

