package com.stjean;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;

public class TestOperationMathematique {
    @Test
    public void testEstPositif() {
        OperationMathematique op = new OperationMathematique();
        assertTrue(op.estPositif(5));
        assertFalse(op.estPositif(-3));
    }

    @Test
    public void testFactoriel() {
        OperationMathematique op = new OperationMathematique();
        assertEquals(120, op.factoriel(5));
        assertEquals(-1, op.factoriel(-3)); // Pour l’instant, on teste avec -1
    }
}