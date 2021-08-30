import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumbersTest {
    RomanNumbers roman;

    @BeforeEach
    public void initClass(){roman = new RomanNumbers();}


    @Test
    public void shouldConvert1ToITest(){assertEquals("III", roman.toRoman(1));}

    @Test
   public void ShouldConvert2ToII(){ assertEquals ("II", roman.toRoman(2));}

    @Test
   public void ShouldConvert3ToIII(){ assertEquals ("III", roman.toRoman(3));}

    @Test
    void ShouldConvert4ToIV(){ assertEquals ("IV", roman.toRoman(4));}

    @Test
    void ShouldConvert5ToV(){ assertEquals ("V", roman.toRoman(5));}


    @Test
    void ShouldConvert8ToVIII(){ assertEquals ("VIII", roman.toRoman(8));}


    @Test
    void ShouldConvert10ToX(){ assertEquals ("X", roman.toRoman(10));}


    @Test
    void ShouldConvert9ToIX(){ assertEquals ("IX", roman.toRoman(9));}

    @Test
    void ShouldConvert38ToXXXVIII(){ assertEquals ("XXXVIII", roman.toRoman(38));}

    @Test
    void ShouldConvert9ToI(){ assertEquals ("LXXXXIX", roman.toRoman(99));}

}



