package genericite;

/**
 * Classe simple utilisée pour démontrer les contraintes génériques.
 * Elle implémente Comparable pour pouvoir être utilisée
 * avec la méthode générique "trouveMax".
 */
public class Stagiaire implements Comparable<Stagiaire> {
    private String nom;
    private double note;

    public Stagiaire(String nom, double note) {
        this.nom = nom;
        this.note = note;
    }

    public String getNom() { return nom; }
    public double getNote() { return note; }

    @Override
    public String toString() {
        return "Stagiaire{" + "nom='" + nom + "', note=" + note + '}';
    }

    /**
     * C'est la méthode requise par l'interface Comparable.
     * Elle permet de définir comment trier les Stagiaires.
     */
    @Override
    public int compareTo(Stagiaire autre) {
        // On compare les stagiaires en fonction de leur note
        // Double.compare est la manière propre de comparer des doubles
        return Double.compare(this.note, autre.note);
    }
}