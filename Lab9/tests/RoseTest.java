import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoseTest {
    @Test
    void testing(){
        Rose rose = new Rose("Rose","Red",20,30.0,true);
        assertEquals("true",rose.toString());
        assertNotEquals("Has a thorn true",rose.toString());
    }

}