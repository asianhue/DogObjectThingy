import static org.junit.Assert.*;

import org.junit.Test;


public class AppTest {
    
    DogObject dog1 = new DogObject("Chihuahua", "Red", "Smol");
    DogObject dog2 = new DogObject("Labradoodle", "Blue", "Medium");
    DogObject dog3 = new DogObject("Golden Retriever", "Gold", "Big");

    @Test
    public void barkTest(){
        assertEquals("them mufukers screams", dog1.getBark());
        assertEquals("loud as fuk", dog3.getBark());
        assertNotEquals("loud af", dog2.getBark());
    }

    @Test
    public void breedTest(){
        assertEquals("Chihuahua", dog1.getBreed());
        assertEquals("Labradoodle", dog2.getBreed());
        assertNotEquals("Labradoogdle", dog3.getBreed());
    }
}
