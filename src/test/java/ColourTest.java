import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColourTest {
    @Test
    public void componentValueCheck() {
        assertThrows(IllegalArgumentException.class, ()-> {
           Colour obj1 = new Colour(-12,46,3);
        });
    }
}