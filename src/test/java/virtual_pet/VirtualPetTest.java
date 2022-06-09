package virtual_pet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class VirtualPetTest {

    @Test
    public void hungerShouldDecreaseWhenFed() {
        VirtualPet underTest = new VirtualPet("testpet", 10, 10, 7);
        underTest.feed();
        Assertions.assertEquals(5, underTest.getHungerLevel());
    }
    @Test
    public void boredomLevelDecreaseWhenFed() {
        VirtualPet underTest = new VirtualPet("testpet", 5, 5, 4);
        underTest.play();
        Assertions.assertEquals(5, underTest.getBoredomLevel());
    }
    @Test
    public void thirstLevelDecreaseWhenFed() {
            VirtualPet underTest = new VirtualPet("testpet", 5, 5, 6);
            underTest.play();
            Assertions.assertEquals(6, underTest.getThirstLevel());
        }
        @Test
    public void hungerThirstBoredomShouldIncreaseWithTime() {
        VirtualPet underTest = new VirtualPet ("testpet",5,5,4);
        underTest.tick();
        assertTrue(underTest.getHungerLevel()>5);
        assertTrue(underTest.getBoredomLevel()>5);
        assertTrue(underTest.getThirstLevel()>4);

            }

        }











