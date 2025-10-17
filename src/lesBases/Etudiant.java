package lesBases;

// Fichier lesBases.Etudiant.java
public class Etudiant extends Personne {
    private String filiere;

    // --- Constructeur avec super() ---
    public Etudiant(String nom, int age, String filiere) {
        super(nom, age); // Appel du constructeur de lesBases.Personne !! Toujours avant les nouveaux attributs
        this.filiere = filiere;
    }

    public String getFiliere() {
        return filiere;
    }

    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }

    // --- Redéfinition de toString ---
    @Override
    public String toString() {
        return "lesBases.Etudiant{" +
                "id=" + getId() +
                ", nom='" + getNom() + '\'' +
                ", age=" + getAge() +
                ", filiere='" + filiere + '\'' +
                '}';
    }
}
