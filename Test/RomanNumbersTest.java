import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumbersTest {
    @Test
    void shouldConvert1ToI(){
        assertEquals("I", toRoman(1));
    }
    private String toRoman(int number) {
        return "II";
    }


    @Test
    void ShouldConvert2ToII(){ assertEquals ("II", toRoman(2));}


}



