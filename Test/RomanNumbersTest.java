import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumbersTest {
    StringBuilder romanNumbers = new StringBuilder("");

    private String toRoman(int number) {

        if (number > 50){
            romanNumbers.append("L");
            number = number - 50;
        }

        if (number > 10 && number < 50){

             number = writeTens(romanNumbers,number);

        }


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

    private int writeTens(StringBuilder romanNumbers, int number) {
        String stringRoman = Integer.toString(number);
        char [] stringRomanToChar = stringRoman.toCharArray();

        int tens = Integer.parseInt(String.valueOf(stringRomanToChar[0]));

        int rest = 0;

        for (int i = 0; i < tens ; i++) {
            romanNumbers.append("X");
            rest = number -= 10;
        }
        return rest;
    }


    public StringBuilder loopAll(int number){

        for (int i = 0; i < number; i++) {

            romanNumbers.append("I");
        }
        return romanNumbers;
    }

    @Test
    void shouldConvert1ToI(){
        assertEquals("I", toRoman(1));
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

    @Test
    void ShouldConvert38ToXXXVIII(){ assertEquals ("XXXVIII", toRoman(38));}

    @Test
    void ShouldConvert9ToI(){ assertEquals ("LXXXXIX", toRoman(99));}





}



