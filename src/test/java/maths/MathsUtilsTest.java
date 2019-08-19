package maths;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Bushy-Netshidaulu
 * on 8/18/2019.
 */
public class MathsUtilsTest {

    private MathsUtils mathsUtils;
    @BeforeEach
    public void init(){
        mathsUtils = new MathsUtils ();
    }
    @Test
    @DisplayName("addition between 2 numbers")
    public void testAdd(){
        int actual = mathsUtils.add ( 2, 2 );
        int expected = 4;
        assertEquals (expected,actual,"add method should add 2 numbers");
    }
    @Test
    @DisplayName ( "subraction between 2 numbers")
    public void testDifference(){
        assertAll ("This test the difference between 2 numbers",
                   ()-> assertEquals (-5,mathsUtils.subract (10,15)),
                   ()-> assertEquals (10,mathsUtils.subract (10,0)),
                   ()-> assertEquals (5, mathsUtils.subract (8,3)),
                   ()-> assertEquals (23,mathsUtils.subract (27,4)),
                   ()-> assertEquals (-5,mathsUtils.subract (10,15)));
    }
    @Test
    @DisplayName ( "Test Multiplication" )
    public void testMulitpy(){
        boolean isTrue = Boolean.logicalAnd (6 == mathsUtils.multiply(2,3), 0 == mathsUtils.multiply(2,0));
        assertTrue (isTrue);
        assertEquals (12,mathsUtils.multiply (4,3));
    }
    @Test
    @DisplayName ("Test Divition")
    public void testDivide(){
        assertEquals (4,mathsUtils.divide (12,3));
        assertThrows (ArithmeticException.class,()-> mathsUtils.divide (5, 0),"divide by zero should throw");
    }
    //Testing all calculator methods at once if one fail all fail
    @Nested
    @DisplayName ( "Calculator test" )
    class calculator{

        @Test
        @DisplayName ("addition +")
        void add(){
            assertEquals (7,mathsUtils.add (2,5));
        }
        @Test
        @DisplayName ("subtraction -")
        void subtract (){
            assertEquals (11,mathsUtils.subract (15,4));
        }
        @Test
        @DisplayName ("multiplication *")
        void multiply(){
            assertEquals ( 20,mathsUtils.multiply (4,5) );
        }
        @Test
        @DisplayName ("divition /")
        void didive(){
            assertEquals (2,mathsUtils.divide (10,5));
        }

    }
}
