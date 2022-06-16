package virtual_pet;

public class RoboticDog extends RoboticPet implements Walking{



        public RoboticDog(String name, int hungerLevel, int boredomLevel, int thirstLevel, int oilLevel, int maintenanceLevel) {
            super(name, hungerLevel, boredomLevel, thirstLevel, oilLevel, maintenanceLevel);
        }

        @Override
        public void walk(){
            OilLevel--;
            MaintenanceLevel--;

            }

    @Override
    public void greeting() {
        System.out.println("robotic dog" + name + "i am robotic pet" + "my hunger level is" + hungerLevel + "my boredom level is" + boredomLevel + "my thirst level is" + thirstLevel + "my oil level is" + OilLevel + "my maintenance level is" + MaintenanceLevel);
    }


}







