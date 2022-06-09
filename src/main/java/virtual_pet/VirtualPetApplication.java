package virtual_pet;

import java.util.Locale;
import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        //Interact with a VirtualPet object in this method
        VirtualPet Animals = new VirtualPet ("Lucky", 5,5,5);
                Scanner input= new Scanner(System.in);
        while (Animals.isAlive()) {
            Animals.showStatus();
            System.out.println("hit selection:feed | play| water| quit");
            String userChoice = input.nextLine();
            switch (userChoice.toLowerCase()) {
                case "feed":
                    Animals.feed();
                    break;
                case "water":
                   Animals.water();
                    break;
                case "play":
                    Animals.play();
                    break;
            }
        }
    }

}
