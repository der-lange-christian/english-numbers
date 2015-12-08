/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.cutl.diguna.englishnumbers.converter;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author chris
 */
public class ConvertToEnglishTest {
    
    ConvertToEnglish cut;
    
    @Before
    public void setUp() {
        cut = new ConvertToEnglish();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testZeroToNine() {
        assertEquals("",      cut.convert(0));
        assertEquals("one",   cut.convert(1));
        assertEquals("two",   cut.convert(2));
        assertEquals("three", cut.convert(3));
        assertEquals("four",  cut.convert(4));
        assertEquals("five",  cut.convert(5));
        assertEquals("six",   cut.convert(6));
        assertEquals("seven", cut.convert(7));
        assertEquals("eight", cut.convert(8));
        assertEquals("nine",  cut.convert(9));
    }

    @Test
    public void testTenToTwenty() {
        assertEquals("ten",       cut.convert(10));
        assertEquals("eleven",    cut.convert(11));
        assertEquals("twelve",    cut.convert(12));
        assertEquals("thirteen",  cut.convert(13));
        assertEquals("fourteen",  cut.convert(14));
        assertEquals("fifteen",   cut.convert(15));
        assertEquals("sixteen",   cut.convert(16));
        assertEquals("seventeen", cut.convert(17));
        assertEquals("eighteen",  cut.convert(18));
        assertEquals("nineteen",  cut.convert(19));
        assertEquals("twenty",    cut.convert(20));
    }
    
    @Test
    public void testDecades() {
        assertEquals("twenty",  cut.convert(20));
        assertEquals("thirty",  cut.convert(30));
        assertEquals("forty",   cut.convert(40));
        assertEquals("fifty",   cut.convert(50));
        assertEquals("sixty",   cut.convert(60));
        assertEquals("seventy", cut.convert(70));
        assertEquals("eighty",  cut.convert(80));
        assertEquals("ninety",  cut.convert(90));        
    }
    
    @Test
    public void testBelowOneThousand() {
        assertEquals("one hundred twenty three",  cut.convert(123));
        assertEquals("one hundred twelve",        cut.convert(112));
        assertEquals("nine hundred eighty seven", cut.convert(987));
    }
    
    @Test
    public void testBelowOneMillion() {
        assertEquals("one hundred twenty three thousand four hundred fifty six", cut.convert(123456));
        assertEquals("one hundred twenty three thousand",                        cut.convert(123000));
    }
}
