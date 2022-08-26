package com.provectus.restTests;

import com.provectus.rest.RestTest;
import com.provectus.rest.entities.Pet;
import com.provectus.rest.entities.User;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class PetRestTest {
  @Test
  public void petRestTest() throws IOException {
    RestTest restTest = new RestTest();
//    String id = restTest.createPet("testPet");
//
//    restTest.getPetByStatus("available");
//    restTest.getPetByStatus("sold");


    Pet pet = new Pet();
    pet.setName("gsonValue");
    pet.setStatus("available");

    restTest.serializePet(pet);

  }
}
