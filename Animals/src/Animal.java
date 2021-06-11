public abstract class Animal {
    int energy;
    int animalCount=0;
    public  void makeSound(){
         energy =-3;
    }
    public void eatFood(){
        energy=+5;
    }
    public void goToSleep(){
        energy=+10;
    }
    public int getAnimalCount(){
        return animalCount;
    }
    public void incrementAnimalCount(){
        animalCount++;
    }
    public int getEnergyLevel(){
        return energy;
    }


}
