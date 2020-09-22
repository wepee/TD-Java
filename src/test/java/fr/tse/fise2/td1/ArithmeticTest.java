package fr.tse.fise2.td1;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArithmeticTest {

    @Test
    public void addition() {
        assertEquals(8, Arithmetic.addition(3, 5));
    }
}