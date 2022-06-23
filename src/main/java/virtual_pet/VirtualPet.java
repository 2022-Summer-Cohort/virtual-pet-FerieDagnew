package virtual_pet;

public abstract class VirtualPet {

    protected String name;

    protected int hungerLevel;

    protected int boredomLevel;

    protected int thirstLevel;


    public VirtualPet (String name, int hungerLevel, int boredomLevel, int thirstLevel) {
        this.name = name;
        this.hungerLevel = hungerLevel;
        this.boredomLevel = boredomLevel;
        this.thirstLevel = thirstLevel;
    }

    public String getName() {
        return name;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public int getBoredomLevel() {
        return boredomLevel;
    }

    public int getThirstLevel() {
        return thirstLevel;
    }

    public void showStatus() {
            System.out.println("Im" + getName() + "Im" + hungerLevel + "Im" + boredomLevel + "Im" + thirstLevel);

        }

        public void feed() { hungerLevel = 5; }

        public void play() { boredomLevel = 5; }

        public void water() { thirstLevel = 5; }

    public void tick() {

            hungerLevel++;
            thirstLevel++;
            boredomLevel++;

        }
        public boolean isAlive(){
        if (hungerLevel > 11 || thirstLevel > 11 || boredomLevel > 11) {
            return false;
        }
            return true;


    }
       public abstract void greeting();

       }














