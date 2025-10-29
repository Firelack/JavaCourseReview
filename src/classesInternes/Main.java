package classesInternes;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        // --- 1. Test de la classe interne (non-statique) ---
        System.out.println("--- 1. Test Classe Interne ---");
        ClasseExterne externe = new ClasseExterne();
        externe.utiliserClasseInterne(); // Affiche le message privé

        // --- 2. Test de la classe interne statique ---
        System.out.println("\n--- 2. Test Classe Interne Statique ---");
        GestionCoordonnees gestion = new GestionCoordonnees();
        gestion.ajouterCoordonnee(0, 10, 20);
        gestion.ajouterCoordonnee(1, 5, 15);
        gestion.afficherCoordonnees();
        // On ne peut pas écrire "new GestionCoordonnees.Paire(1,1)" ici car Paire est privée.

        // --- 3. Test de la classe anonyme (l'ancêtre) ---
        System.out.println("\n--- 3. Test Classe Anonyme ---");
        String[] mots = {"Java", "est", "puissant"};
        
        // On veut trier par longueur de mot. On a besoin d'un Comparator.
        // On crée une CLASSE ANONYME qui implémente l'interface Comparator
        Comparator<String> comparateurAncien = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        };
        Arrays.sort(mots, comparateurAncien);
        System.out.println("Tri (ancien) : " + Arrays.toString(mots));

        // --- 4. Test avec Expression Lambda (le moderne) ---
        System.out.println("\n--- 4. Test Expression Lambda ---");
        String[] mots2 = {"Le", "code", "moderne"};

        // C'est la MÊME chose que ci-dessus, mais en plus court !
        // 
        Comparator<String> comparateurModerne = (s1, s2) -> Integer.compare(s1.length(), s2.length());
        
        Arrays.sort(mots2, comparateurModerne);
        System.out.println("Tri (moderne) : " + Arrays.toString(mots2));
    }
}