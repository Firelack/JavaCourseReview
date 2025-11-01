package collections;

// Importe toutes les classes nécessaires
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        // --- 1. List (ArrayList) ---
        // Une liste ordonnée qui accepte les doublons
        System.out.println("--- 1. List (ArrayList) ---");
        List<String> maListe = new ArrayList<>();
        maListe.add("Pomme");
        maListe.add("Banane");
        maListe.add("Orange");
        maListe.add("Pomme"); // Doublon accepté

        System.out.println("Élément à l'index 1 : " + maListe.get(1));
        System.out.println("Liste complète : " + maListe);

        // Tri avec la classe utilitaire Collections
        Collections.sort(maListe);
        System.out.println("Liste triée : " + maListe);


        // --- 2. Set (HashSet) ---
        // Un ensemble non ordonné qui n'accepte PAS les doublons
        System.out.println("\n--- 2. Set (HashSet) ---");
        Set<String> monSet = new HashSet<>();
        monSet.add("Rouge");
        monSet.add("Vert");
        monSet.add("Bleu");
        monSet.add("Rouge"); // Doublon ignoré

        System.out.println("Taille du Set : " + monSet.size());
        System.out.println("Le Set contient 'Vert' ? " + monSet.contains("Vert"));
        // L'ordre d'affichage n'est pas garanti
        System.out.println("Set complet : " + monSet);


        // --- 3. Map (HashMap) ---
        // Un dictionnaire qui stocke des paires Clé -> Valeur
        System.out.println("\n--- 3. Map (HashMap) ---");
        Map<String, Integer> ages = new HashMap<>();
        ages.put("Alice", 25); // Clé "Alice", Valeur 25
        ages.put("Bob", 30);
        ages.put("Charlie", 25);

        System.out.println("Âge de Bob : " + ages.get("Bob"));
        
        // Parcourir un Map (avec les clés)
        System.out.println("Parcours du Map :");
        for (String nom : ages.keySet()) {
            Integer age = ages.get(nom);
            System.out.println(nom + " a " + age + " ans.");
        }
    }
}