package virtual_pet;

public class RoboticCat extends RoboticPet {
    public RoboticCat(String name, int hungerLevel, int boredomLevel, int thirstLevel, int oilLevel, int maintenanceLevel) {
        super(name, hungerLevel, boredomLevel, thirstLevel, oilLevel, maintenanceLevel);
    }

    @Override
    public void greeting() {
        System.out.println("robotic cat" + name + "i am robotic pet" + "my hunger level is" + hungerLevel + "my boredom level is" + boredomLevel + "my thirst level is" + thirstLevel + "my oil level is" + OilLevel + "my maintenance level is" + MaintenanceLevel);
    }
}

