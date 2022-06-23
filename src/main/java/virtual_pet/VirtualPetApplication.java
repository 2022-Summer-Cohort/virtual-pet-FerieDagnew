package virtual_pet;

import java.util.Locale;
import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        //Interact with a VirtualPet object in this method
        VirtualPetShelter shelter = new VirtualPetShelter();
        Scanner input = new Scanner(System.in);
        while (shelter.allAlive()) {
            shelter.showStatus();
            System.out.println("hit selection:feed|adopt|play|water|quit|admit|walk|clean cage|clean litter box|oil|maintain|");
            String userChoice = input.nextLine();
            switch (userChoice.toLowerCase()) {
                case "feed":
                    shelter.wateredAll();
                    break;
                case "water":
                    shelter.feedAll();
                    break;
                case "play":
                    shelter.playAll();
                    break;
                case "oil":
                    shelter.OilAll();
                    break;
                case"maintain":
                    shelter.MaintainRoboticAll();
                    break;
                case "adopt":
                    System.out.println("which pet you want to adopt?");
                    String petName;
                    petName = input.nextLine();
                    shelter.adoptPet(petName);
                  break;
                case "admit":
                    System.out.println("which pet you want to admit?");
                    petName = input.nextLine();
                    VirtualPet pet = new RoboticDog(petName,5,5,5,5,5);
                    shelter.admitPet(pet);
                    break;
                case "walk":
                    shelter.walk();
                    break;
                case "clean cage":
                    shelter.CleanCage();
                    break;
                case "clean litter box":
                    shelter.CleanLitterBox();
                    break;


            }
        }

    }
}




