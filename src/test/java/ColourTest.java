import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColourTest {
    @Test
    public void validObjectInstantiation() {
        Colour obj1 = new Colour(45, 24, 67);
        assertTrue((obj1.getR() == obj1.r && obj1.getG() == obj1.g && obj1.getB() == obj1.b), "Object was successfully created");
    }

    @Test
    public void componentValueCheck() {
        assertThrows(IllegalArgumentException.class, ()-> {
           Colour obj1 = new Colour(-12,46,3);
        });
    }
}