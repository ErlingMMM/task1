import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumbersTest {
    StringBuilder romanNumbers = new StringBuilder();

    @Test
    void shouldConvert1ToI(){
        assertEquals("I", toRoman(1));
    }

    private String toRoman(int number) {
        if (number == 4) return "IV";
        if (number == 5) return "V";
        //if( number > 5) return
        return loopAll(number).toString();

    }


    @Test
    void ShouldConvert2ToII(){ assertEquals ("II", toRoman(2));}

    @Test
    void ShouldConvert3ToIII(){ assertEquals ("III", toRoman(3));}

    @Test
    void ShouldConvert4ToIV(){ assertEquals ("IV", toRoman(4));}

    @Test
    void ShouldConvert5ToV(){ assertEquals ("V", toRoman(5));}


   public StringBuilder loopAll(int number){

        for (int i = 0; i < number; i++) {

            romanNumbers.append("I");
        }
        return romanNumbers;
    }



}



