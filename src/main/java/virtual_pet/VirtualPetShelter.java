package virtual_pet;

import java.util.ArrayList;

public class VirtualPetShelter {

    private ArrayList<VirtualPet> shelter;

    public VirtualPetShelter() {
        shelter = new ArrayList<>();
        shelter.add(new RoboticDog("Alex", 5, 5, 5, 5, 5));
        shelter.add(new RoboticCat("Ally", 5, 5, 5, 5, 5));
        shelter.add(new OrganicDog("Toni", 5, 5, 5, 5));
        shelter.add(new OrganicCat("Alex", 5, 5, 5, 5));

    }


    public void playAll() {
        for (VirtualPet pet : shelter) {
            pet.play();
        }

    }

    public void feedAll() {
        for (VirtualPet pet : shelter) {
            pet.feed();
        }
    }

    public void wateredAll() {
        for (VirtualPet pet : shelter) {
            pet.water();
        }
    }

    public void OilAll() {
        for (VirtualPet pet : shelter) {
            if (pet instanceof RoboticPet) {
                ((RoboticPet) pet).oil();


            }
        }
    }

    public void admitPet(VirtualPet Animals) {
        shelter.add(Animals);

    }

    public void adoptPet(String petName) {
        for (VirtualPet pet : shelter) {
            pet.getName();
        }
    }

    public void PetStatus(VirtualPet Animals) {
        for (VirtualPet pet : shelter) {
            Animals.showStatus();
        }
    }

    public void tick() {
        for (VirtualPet pet : shelter) {
            pet.tick();
        }
    }

    public VirtualPet getPet(int index) {
        return shelter.get(index);
    }

    public void MaintainRoboticAll() {
        for (VirtualPet pet : shelter) {
            if (pet instanceof RoboticPet) {
                ((RoboticPet) pet).MaintainRobot();
            }
            pet.water();
        }
    }

    public void showStatus() {
        for (VirtualPet pet : shelter) {
            pet.greeting();
        }
    }

    public void walk() {
        for (VirtualPet pet : shelter) {
            if (pet instanceof Walking) {
                ((Walking) pet).walk();
            }
        }
    }

    public void CleanCage() {
        for (VirtualPet pet : shelter) {
            if (pet instanceof OrganicDog) {
                ((OrganicDog) pet).CleanCage();
            }

        }
    }

    public void CleanLitterBox() {
        for (VirtualPet pet : shelter) {
            if (pet instanceof OrganicCat) {
                ((OrganicCat) pet).CleanLitterBox();
            }
        }
    }

    public boolean allAlive() {
        for (VirtualPet pet : shelter) {
            if (!pet.isAlive()) {
                return false;
            }
        }
        return true;
    }

}

