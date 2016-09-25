package es.upm.miw.SwC.AlAy;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FractionTest {

    private Fraction fr;
    
    @Before
    public void before() {
        fr = new Fraction(10, 2);
    }
    
    @Test
    public void testFractionIntInt() {
        assertEquals(10, fr.getNumerator());
        assertEquals(2, fr.getDenominator());
    }

    @Test
    public void testFraction() {
        fr = new Fraction();
        assertEquals(1, fr.getNumerator());
        assertEquals(1, fr.getDenominator());
    }

    @Test
    public void testGetNumerator() {
        assertEquals(10, fr.getNumerator());
    }

    @Test
    public void testGetDenominator() {
        assertEquals(2, fr.getDenominator());
    };

    @Test
    public void testDecimal() {
        assertEquals(5,fr.decimal(),10e-5);
    }

}
