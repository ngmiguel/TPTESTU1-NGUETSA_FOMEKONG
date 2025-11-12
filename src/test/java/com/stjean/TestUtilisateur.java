package com.stjean;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestUtilisateur {
    @Test
    public void testAjouterEmailInvalide() {
        Utilisateur u = new Utilisateur(1, "Jean", 20, "jean.com", "123", "Paris", 100.0);
        try {
            Utilisateur.ajouter(u);
            fail("Devrait lever une exception");
        } catch (Utilisateur.EmailInvalidException e) {
            assertTrue(true);
        }
    }

    @Test
    public void testAnalyseSoldeGeneral() throws Utilisateur.NegativeGeneralBalanceException {
        Utilisateur.users.clear();
        Utilisateur.users.add(new Utilisateur(1, "Jean", 20, "jean@ex.com", "123", "Paris", 100.0));
        Utilisateur.users.add(new Utilisateur(2, "Paul", 30, "paul@ex.com", "456", "Lyon", -50.0));
        assertEquals(50.0, Utilisateur.analyseSoldeGeneral(), 0.01);
    }
}
