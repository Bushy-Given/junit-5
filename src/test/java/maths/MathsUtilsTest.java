package maths;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
    public void testAdd(){
        int actual = mathsUtils.add ( 2, 2 );
        int expected = 4;
        assertEquals (expected,actual,"add method should add 2 numbers");
    }
    @Test
    public void testDivide(){
        assertThrows (ArithmeticException.class,()-> mathsUtils.divide (5, 0),"divide by zero should throw");
    }
}
