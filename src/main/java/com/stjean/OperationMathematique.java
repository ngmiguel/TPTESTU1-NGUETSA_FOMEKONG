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
    public int[] trier(int[] listes) {
        int[] resultat = listes.clone();
        for (int i = 0; i < resultat.length - 1; i++) {
            for (int j = i + 1; j < resultat.length; j++) {
                if (resultat[i] < resultat[j]) {
                    int temp = resultat[i];
                    resultat[i] = resultat[j];
                    resultat[j] = temp;
                }
            }
        }
        return resultat;
    }
}