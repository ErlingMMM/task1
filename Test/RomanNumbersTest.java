import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumbersTest {
    @Test
    void shouldConvert1ToI(){
        assertEquals("I", toRoman(1));
    }

    private String toRoman(int number) {
        if(number == 1) return "I";
        if(number == 2) return "II";
        return null;

    }


    @Test
    void ShouldConvert2ToII(){ assertEquals ("II", toRoman(2));}


}



