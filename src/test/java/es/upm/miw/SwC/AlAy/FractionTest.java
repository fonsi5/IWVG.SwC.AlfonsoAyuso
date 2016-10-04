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
    
    @Test
    public void testIsEquivalente() {
        assertTrue(fr.isEquivalente(5, 1));
        assertFalse(fr.isEquivalente(3, 5));
    }

    @Test
    public void testSum() {
        Fraction fraction= new Fraction(1,2);
        assertEquals(1.25, fraction.sum(3, 4),10e-5);
        
    }
}
