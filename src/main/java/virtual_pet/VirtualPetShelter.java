package virtual_pet;

import java.util.ArrayList;

public class VirtualPetShelter {

    private ArrayList<VirtualPet> shelter;

    public VirtualPetShelter() {
        shelter = new ArrayList<>();
        shelter.add(new VirtualPet("Alex", 5, 5, 5));
        shelter.add(new VirtualPet("Ally", 5, 5, 5));
        shelter.add(new VirtualPet("Toni", 5, 5, 5));
        shelter.add(new VirtualPet("Sue", 5, 5, 5));

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

    public void admitPet(VirtualPet Animals) {
        shelter.add(Animals);

    }

    public void adoptPet() {
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
}