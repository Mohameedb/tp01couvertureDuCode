package LineCoverageTest;

import org.example.RomanNumeral;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralTest {
    @Test
    public void InputOutOfRangeRaiseExecption(){
        assertThrows(IllegalArgumentException.class,()-> RomanNumeral.toRoman(4000));
    }
    @Test
    public void InputOutOfRangeRaiseAnotherException(){
        assertThrows(IllegalArgumentException.class,()->RomanNumeral.toRoman(-85));
    }
    @Test
    public void ValideInputReturnTheRightTerm(){
        assertEquals("VI",RomanNumeral.toRoman(6));
    }


}