import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColourTest {
    @Test
    public void validObjectInstantiation() {
        Colour obj1 = new Colour(45, 24, 67, "Colour");
        assertTrue((obj1.getR() == obj1.r && obj1.getG() == obj1.g && obj1.getB() == obj1.b), "Object was successfully created");
    }

    @Test
    public void componentValueCheck() {
        assertThrows(IllegalArgumentException.class, ()-> {
           Colour obj1 = new Colour(-12,46,3, "Colour");
        });
    }

    @Test
    public void colourModelCheck() {
        Colour obj1 = new Colour(255, 255, 0, "Yellow");
        assertTrue((obj1.colourModel == obj1.getModel()), "Object model has been created");
    }

    @Test
    public void checkValidityOfColourModel() {
        assertThrows(IllegalArgumentException.class, ()-> {
           Colour obj1 = new Colour(255, 255, 0, "12345");
        });
    }

    @Test
    public void checkIfEquals(){
        Colour obj1 = new Colour(255, 255, 0, "Yellow");
        Colour obj2 = new Colour(255, 255, 0, "Yellow");
        assertTrue(obj1.equals(obj2), "Objects are equal");
    }

    @Test
    public void additionValidity() {
        assertThrows(IllegalArgumentException.class, ()-> {
            Colour obj1 = new Colour(12,46,3, "Yellow");
            Colour obj2 = new Colour(46, 87, 255, "Yellow");
            obj1.add(obj2);
        });
    }

}