package virtual_pet;

import virtual_pet.VirtualPet;

public abstract class RoboticPet extends VirtualPet{

    protected int OilLevel;

    protected int MaintenanceLevel;

    public RoboticPet(String name, int hungerLevel, int boredomLevel, int thirstLevel, int oilLevel, int maintenanceLevel) {
        super(name, hungerLevel, boredomLevel, thirstLevel);
        this.OilLevel = oilLevel;
        this.MaintenanceLevel = maintenanceLevel;
    }


    public void oil(){
        OilLevel += 5;
    }


 public int MaintainRobot() {
       return MaintenanceLevel= 5;
     }
 }


