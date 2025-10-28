package genericite;

public class Main {
    public static void main(String[] args) {
        
        // --- Partie 1 : Classe générique (Boite) ---
        System.out.println("--- 1. Exemple de CLASSE générique ---");
        
        // On instancie la classe en spécifiant <String>
        Boite<String> boiteTexte = new Boite<>("Bonjour");
        
        // Avantage 1 : Pas de cast nécessaire
        String texte = boiteTexte.getContenu(); 
        System.out.println(texte.toUpperCase());

        // On réutilise la MÊME classe Boite, mais avec <Integer>
        Boite<Integer> boiteNombre = new Boite<>(42);
        int nombre = boiteNombre.getContenu();
        System.out.println("Le nombre + 1 = " + (nombre + 1));
        
        // Avantage 2 : Sécurité à la compilation
        // boiteTexte.setContenu(123); // ❌ ERREUR ! Le compilateur sait que la boite ne contient que des String.

        
        // --- Partie 2 : Méthode générique avec CONTRAINTE (extends) ---
        System.out.println("\n--- 2. Exemple de MÉTHODE générique avec contrainte ---");
        
        // On crée un tableau de Stagiaires
        // Stagiaire implémente Comparable, donc ça fonctionne.
        Stagiaire[] stagiaires = {
            new Stagiaire("Alice", 15.5),
            new Stagiaire("Bob", 12.0),
            new Stagiaire("Charlie", 18.0)
        };
        
        Stagiaire meilleurStagiaire = trouveMax(stagiaires);
        System.out.println("Le meilleur stagiaire (note la plus haute) est : " + meilleurStagiaire.getNom());
        
        
        // --- Preuve que la contrainte fonctionne ---
        //
        // Boite n'implémente PAS Comparable.
        // Si on essayait de l'passer à la méthode :
        //
        // trouveMax(new Boite[]{ boiteTexte }); 
        //
        // On aurait une ERREUR DE COMPILATION car "Boite" n'est pas "Comparable".
        // C'est la garantie de sécurité que la contrainte nous offre.
    }

    /**
     * Méthode générique avec une contrainte (type borné).
     * T doit être un type qui implémente l'interface Comparable.
     * On utilise "extends" même pour les interfaces dans ce contexte.
     *
     */
    public static <T extends Comparable<T>> T trouveMax(T[] tableau) {
        if (tableau == null || tableau.length == 0) {
            return null;
        }
        
        T max = tableau[0];
        for (int i = 1; i < tableau.length; i++) {
            // On peut appeler .compareTo() en toute sécurité,
            // car la contrainte le garantit.
            if (tableau[i].compareTo(max) > 0) {
                max = tableau[i];
            }
        }
        return max;
    }
}