package virtual_pet;



public class OrganicCat extends OrganicPet {
    public OrganicCat(String name, int hungerLevel, int boredomLevel, int thirstLevel, int cleanlinessLevel) {
        super(name, hungerLevel, boredomLevel, thirstLevel, cleanlinessLevel);
    }
    @Override
    public void showStatus(){
        System.out.println("my name " + getName() + " hunger " + hungerLevel + " boredom " + boredomLevel + " thirst " + thirstLevel + " my letterbox is "+ cleanlinessLevel);
    }

@Override
public void greeting() {
    System.out.println("organic cat"+ name + "i am organic pet"+ "my hunger level is"+ hungerLevel + "my boredom level is"+ boredomLevel + "my thirst level is" + thirstLevel + " my letterbox is" + cleanlinessLevel);
}
}






