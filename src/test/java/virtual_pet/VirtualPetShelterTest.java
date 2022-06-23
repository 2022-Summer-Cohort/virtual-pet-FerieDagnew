package virtual_pet;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VirtualPetShelterTest {

@Test
  void ShouldFeedAllTest() {
      VirtualPetShelter underTest = new VirtualPetShelter();
      underTest.feedAll();
      assertEquals(5, underTest.getPet(0). getHungerLevel());
}
@Test
 void shouldMaintainRobotic() {
    VirtualPetShelter underTest = new VirtualPetShelter();
    underTest.MaintainRoboticAll();
    assertEquals(5, ((RoboticPet)underTest.getPet(0)). getMaintenanceLevel());


}

@Test
  void ShouldWaterAllTest() {
      VirtualPetShelter underTest = new VirtualPetShelter();
      underTest.wateredAll();
      assertEquals(5,underTest.getPet(0).getThirstLevel());
}

@Test
 void ShouldPlayAll() {
     VirtualPetShelter underTest = new VirtualPetShelter();
     underTest.playAll();
     assertEquals(5, underTest.getPet(0).getBoredomLevel());
}

@Test
public void HungerThirstBoredomLevelShouldIncreaseWithTick() {
    VirtualPetShelter underTest = new VirtualPetShelter();
    underTest.playAll();
    assertEquals(5, underTest.getPet(0).getBoredomLevel());
 }
@Test
    public void shouldOilAll() {
    VirtualPetShelter underTest = new VirtualPetShelter();
    underTest.OilAll();
    assertEquals(5,((RoboticPet) underTest.getPet(0)).OilLevel());
}
}






