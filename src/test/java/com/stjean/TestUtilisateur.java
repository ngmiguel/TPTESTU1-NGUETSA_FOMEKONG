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
}
