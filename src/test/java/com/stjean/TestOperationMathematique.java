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

    @Test
    public void testTrier() {
        OperationMathematique op = new OperationMathematique();
        int[] tableau = {3, 1, 4, 1, 5};
        int[] resultat = op.trier(tableau);
        assertEquals(5, resultat[0]);
        assertEquals(4, resultat[1]);
        assertEquals(3, resultat[2]);
        assertEquals(1, resultat[3]);
        assertEquals(1, resultat[4]);
    }

    @Test(expected = IllegalParamISIException.class)
    public void testFactorielNegatif() throws IllegalParamISIException {
        OperationMathematique op = new OperationMathematique();
        op.factoriel(-1);
    }

    @Test
    public void testMaxNumba() {
        OperationMathematique op = new OperationMathematique();
        double[] valeurs = {1.5, 2.7, 0.3, 4.9};
        assertEquals(4.9, op.maxNumba(valeurs), 0.01);
    }
}