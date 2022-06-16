package virtual_pet;

public class OrganicDog extends OrganicPet implements Walking {


    public OrganicDog(String name, int hungerLevel, int boredomLevel, int thirstLevel, int cleanlinessLevel) {
        super(name, hungerLevel, boredomLevel, thirstLevel, cleanlinessLevel);
    }

    @Override
    public void walk() {
        boredomLevel--;
        cleanlinessLevel++;
    }

    @Override
    public void showStatus() {
        System.out.println("my name " + getName() + " hunger " + hungerLevel + " boredom " + boredomLevel + " thirst " + thirstLevel + " my cage is " + cleanlinessLevel);
    }

    @Override
    public void greeting() {
        System.out.println("organic dog" + name + "i am organic pet" + "my hunger level is" + hungerLevel + "my boredom level is" + boredomLevel + "my thirst level is" + thirstLevel + " my cage cleanliness is" + cleanlinessLevel);
    }
}


