package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // --- 1. Gérer une exception "checked" personnalisée ---
        System.out.println("--- 1. Gestion d'une exception 'checked' ---");
        Compte compte = new Compte(100.0);
        
        try {
            System.out.println("Solde : " + compte.getSolde());
            System.out.println("Débit de 50€...");
            compte.debiter(50.0); // Tout va bien
            System.out.println("Nouveau solde : " + compte.getSolde());
            
            System.out.println("\nDébit de 200€...");
            compte.debiter(200.0); // Va lever l'exception
            System.out.println("Cette ligne ne sera pas atteinte.");
            
        } catch (DebitImpossibleException e) {
            // L'exception est attrapée ici !
            System.out.println("ERREUR : " + e.getMessage());
        }
        
        System.out.println("Solde final : " + compte.getSolde());

        
        // --- 2. Gérer une "RuntimeException" avec finally ---
        System.out.println("\n--- 2. Gestion d'une 'RuntimeException' avec finally ---");
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Entrez un nombre entier : ");
            int nombre = sc.nextInt(); // Risque de InputMismatchException
            System.out.println("Vous avez saisi : " + nombre);
            
        } catch (InputMismatchException e) {
            // Plan B si l'utilisateur n'entre pas un nombre
            System.out.println("Erreur ! Vous n'avez pas saisi un nombre entier.");
            
        } finally {
            // Ce bloc s'exécute toujours
            System.out.println("Le scanner va être fermé.");
            sc.close(); // Parfait pour libérer les ressources
        }
    }
}