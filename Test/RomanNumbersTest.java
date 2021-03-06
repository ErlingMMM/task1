import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumbersTest {
    StringBuilder romanNumbers = new StringBuilder("");

    @Test
    void shouldConvert1ToI(){
        assertEquals("I", toRoman(1));
    }
//Here is the requested comment.
    private String toRoman(int number) {

        if (number == 4){
            return romanNumbers.append("IV").toString();
        }
        if (number == 5){
            return romanNumbers.append("V").toString();
        }

        if (number == 9){
            return romanNumbers.append("IX").toString();
        }

        if (number == 10){
            return romanNumbers.append("X").toString();
        }

        if (number > 5){
            romanNumbers.append("V");
            number = number - 5;
        }

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


    @Test
    void ShouldConvert8ToVIII(){ assertEquals ("VIII", toRoman(8));}


    @Test
    void ShouldConvert10ToX(){ assertEquals ("X", toRoman(10));}


    @Test
    void ShouldConvert9ToIX(){ assertEquals ("IX", toRoman(9));}



    public StringBuilder loopAll(int number){

        for (int i = 0; i < number; i++) {

            romanNumbers.append("I");
        }
        return romanNumbers;
    }



}


//reverted


