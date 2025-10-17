package lesBases;// Fichier lesBases.Personne.java

public class Personne {
    // --- Attributs privés (encapsulation) ---
    private String nom;
    private int age;
    private final int id;
    // les attributs par défauts sont 0, 0.0, null, false, '\u0000'

    // --- Attribut statique (compteur global pour les IDs) ---
    private static int compteur = 0;

    // --- Bloc d'initialisation (exécuté avant chaque constructeur) ---
    {
        compteur++;
        id = compteur;
        System.out.println("Bloc d'initialisation exécuté : création d'une nouvelle lesBases.Personne");
    }

    // --- Constructeur principal ---
    public Personne(String nom, int age) {
        this.nom = nom;
        // Vérification d'age
        if (age >= 0) {
            this.age = age;
        } else {
            this.age = 0;
        }
    }

    // --- Surcharge de constructeur (utilise this pour appeler l'autre) ---
    public Personne(String nom) {
        this(nom, 0); // Appel du constructeur principal
    }

    // --- Getters et Setters ---
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public String periodAge() {
        if (age < 0) {
            return "Age invalide";
        } else if (age < 18) {
            return "Mineur";
        } else if (age < 25) { // Pas besoin de "age >= 18" car déjà vérifié
            return "Jeune majeur";
        } else {
            return "Majeur";
        }
    }

    public void setAge(int age) {
        if (age >= 0) this.age = age; // petite validation
    }

    public int getId() {
        return id;
    }

    // --- Méthode toString (pour affichage propre) ---
    @Override //signifie qu'on réecrit une méthode déjà présente chez un parent
    public String toString() {
        return "lesBases.Personne{id=" + id + ", nom='" + nom + "', age=" + age + "}";
    }

    // --- Méthode statique ---
    public static int getCompteur() {
        return compteur;
    }

    // --- Méthode avec paramètres variables ---
    public static int somme(int... nombres) {
        int total = 0;
        for (int n : nombres) total += n;
        return total;
    }
}
