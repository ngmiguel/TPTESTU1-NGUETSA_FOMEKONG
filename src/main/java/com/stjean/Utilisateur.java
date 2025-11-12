package com.stjean;

import java.util.ArrayList;

public class Utilisateur {

    public static ArrayList<Utilisateur> users = new ArrayList<>();
    private int id;
    private String nom;
    private int age;
    private String email;
    private String telephone;
    private String ville;
    private double soldePersonnel;

    public Utilisateur(int id, String nom, int age, String email, String telephone, String ville, double soldePersonnel) {
        this.id = id;
        this.nom = nom;
        this.age = age;
        this.email = email;
        this.telephone = telephone;
        this.ville = ville;
        this.soldePersonnel = soldePersonnel;
    }

    // Getters et setters (ajoute-les toi-même pour simplifier)


    class EmailInvalidException extends Exception {
        public EmailInvalidException(String message) {
            super(message);
        }
    }

    class SuppressionInvalidException extends Exception {
        public SuppressionInvalidException(String message) {
            super(message);
        }
    }

    public static void ajouter(Utilisateur user) throws EmailInvalidException {
        if (!user.email.contains("@") || !user.email.contains(".")) {
            throw new EmailInvalidException("Email invalide");
        }
        users.add(user);
    }

    public static void supprimer(int id) throws SuppressionInvalidException {
        boolean found = false;
        for (Utilisateur u : users) {
            if (u.id == id) {
                users.remove(u);
                found = true;
                break;
            }
        }
        if (!found) throw new SuppressionInvalidException("Utilisateur inexistant");
    }

    public static void lister() {
        for (Utilisateur u : users) {
            System.out.println(u.nom);
        }
    }

    public static void afficher(int id) {
        for (Utilisateur u : users) {
            if (u.id == id) {
                System.out.println(u.nom + " - " + u.soldePersonnel);
                return;
            }
        }
        System.out.println("Utilisateur non trouvé");
    }

    public static double analyseSoldeGeneral() throws NegativeGeneralBalanceException {
        double total = 0;
        for (Utilisateur u : users) {
            total += u.soldePersonnel;
        }
        if (total < 0) throw new NegativeGeneralBalanceException("Solde général négatif");
        return total;
    }

    public static Utilisateur getRiche() {
        Utilisateur riche = null;
        for (Utilisateur u : users) {
            if (riche == null || u.soldePersonnel > riche.soldePersonnel) {
                riche = u;
            }
        }
        return riche;
    }

    class NegativeGeneralBalanceException extends Exception {
        public NegativeGeneralBalanceException(String message) {
            super(message);
        }
    }
}
