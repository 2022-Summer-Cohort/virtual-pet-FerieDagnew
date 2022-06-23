package virtual_pet;

import virtual_pet.VirtualPet;

public abstract class OrganicPet extends VirtualPet{

    protected int cleanlinessLevel;


    public OrganicPet(String name, int hungerLevel, int boredomLevel, int thirstLevel, int cleanlinessLevel) {
        super(name, hungerLevel, boredomLevel, thirstLevel);
        this.cleanlinessLevel= cleanlinessLevel;
    }

    public void CleanLitterBox(){
        cleanlinessLevel=5;
    }
    public void CleanCage(){
        cleanlinessLevel=5;
    }

@Override
    public void tick(){
        super.tick();
        cleanlinessLevel++;
}
}


