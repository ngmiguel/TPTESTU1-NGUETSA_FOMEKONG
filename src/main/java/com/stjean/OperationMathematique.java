package com.stjean;

public class OperationMathematique {
    public boolean estPositif(int nombre) {
        return nombre > 0;
    }
    public int factoriel(int nombre) {
        if (nombre < 0) return -1; // Pour l’instant, on retourne -1 si négatif
        int result = 1;
        for (int i = 1; i <= nombre; i++) {
            result *= i;
        }
        return result;
    }
}