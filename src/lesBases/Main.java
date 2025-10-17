package lesBases;// Fichier lesBases.Main.java

public class Main {
    public static void main(String[] args) {

        // --- Création d'objets ---
        // objet nom = new objet(parametres);
        Personne p1 = new Personne("Alice", 25);
        Personne p2 = new Personne("Bob");
        Etudiant e1 = new Etudiant("Charlie", 20, "Informatique");

        // --- Utilisation de toString ---
        System.out.println(p1); //println : print puis retour à la ligne
        System.out.println(p2); //print : print sans retour à la ligne
        System.out.println(e1); //Ne pas oublier ";" à la fin des lignes

        // --- Appel d'une méthode statique ---
        System.out.println("Nombre total de personnes : " + Personne.getCompteur());

        // --- Opérateur ternaire ---
        String majeur = (p1.getAge() >= 18) ? "majeur" : "mineur"; //variable = condition? siOui: siNon
        System.out.println(p1.getNom() + " est " + majeur);

        // --- Boucle for ---
        System.out.println("\nBoucle for :");
        for (int p = 0; p < 3; p++) { //(debut, fin, pas)
            System.out.println("Itération " + p);
        }

        // --- Boucle while ---
        System.out.println("\nBoucle while :");
        int compteur = 0;
        while (compteur < 3) {
            System.out.println("Compteur : " + compteur);
            compteur++;
        }

        // --- Switch ---
        System.out.println("\nExemple de switch :");
        int jour = 2;
        switch (jour) {
            case 1 : System.out.println("Lundi"); //Si jour = 1
                    break; // s'arrete ici
            case 2 : System.out.println("Mardi"); //continue jusqu'a rencontrer un break ou la fin du bloc
            case 3 : System.out.println("Mercredi");
            default : System.out.println("Autre jour"); // Si jour pas 1 2 3
        }
        System.out.println("\nExemple de switch version return :");
        switch (jour) {
            case 1 -> System.out.println("Lundi");
            case 2 -> System.out.println("Mardi");
            case 3 -> System.out.println("Mercredi");
            default -> System.out.println("Autre jour");
        }

        // --- Méthode avec paramètres variables ---
        System.out.println("\nSomme de 1,2,3,4 = " + Personne.somme(1, 2, 3, 4));

        // Quelques calculs
        System.out.println("2.0/0 = " + 2.0/0);
        System.out.println("3/2.0 = " + 5/2.0);
        System.out.println("3/2 = " + 5/2);
        System.out.println("3%2 = " + 5%2);
        System.out.println("java.lang.Math.pow(5,2) = " + java.lang.Math.pow(5, 2));
        System.out.println("java.lang.Math.random() = " + java.lang.Math.random());

        int x = 5;
        System.out.println(x++); // affiche 5 (x devient 6 ensuite)
        System.out.println(++x); // affiche 7 (x était 6, incrémenté avant affichage)

        // --- Tableaux ---
        System.out.println("\n--- Tableaux ---");

        // Tableau simple
        int[] nombres = {1,2,3,4,5};
        System.out.println("Taille du tableau : " + nombres.length);

        // Accès classique avec for
        for (int a = 0; a < nombres.length; a++) {
            System.out.println("nombres[" + a + "] = " + nombres[a]);
        }

        // Boucle for-each (parcourt directement les valeurs)
        System.out.println("\nBoucle for-each :");
        for (int n : nombres) {
            System.out.println("Valeur : " + n);
        }

        // Tableau de tableaux (matrice)
        System.out.println("\n--- Tableau de tableaux ---");
        int[][] matrice = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Accès aux éléments
        System.out.println("matrice[1][2] = " + matrice[1][2]); // ligne 1, colonne 2 (valeur 6)

        // Parcours de la matrice
        for (int z = 0; z < matrice.length; z++) {
            for (int j = 0; j < matrice[z].length; j++) {
                System.out.print(matrice[z][j] + " ");
            }
            System.out.println();
        }


        // --- Transtypage ---
        System.out.println("\n--- Transtypage (cast) ---");

        // Implicite : int → double
        int entier = 10;
        double reel = entier; // Pas de risque, conversion automatique
        System.out.println("Conversion implicite : int -> double : " + reel);

        // Explicite : double → int
        double reel2 = 9.78;
        int entier2 = (int) reel2; // Conversion forcée (troncature)
        System.out.println("Conversion explicite : double -> int : " + entier2);

        // Exemple avec objets (héritage)
        Personne p = new Etudiant("Dylan", 22, "Maths"); // upcasting automatique
        // p est vu comme une lesBases.Personne, mais contient un lesBases.Etudiant
        System.out.println(p);

        // Downcasting (nécessite un cast explicite)
        if (p instanceof Etudiant) { // toujours vérifier avant de caster !
            Etudiant etu = (Etudiant) p;
            System.out.println("Transtypage objet réussi : " + etu.getFiliere());
        }
    }
}
