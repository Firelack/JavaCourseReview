package classeAbstraite;

// Classe abstraite : modèle général pour tous les animaux
public abstract class Animal {
    protected String nom; //seules les classes du même package et les sous-classes (comme Chien et Chat) peuvent y accéder directement

    public Animal(String nom) {
        this.nom = nom;
    }

    // Méthode normale
    public void sePresenter() {
        System.out.println("Je suis " + nom);
    }

    // Méthode abstraite : pas de corps, chaque animal la définira à sa manière
    public abstract void parler();

    @Override
    public String toString() {
        return "Animal{" +
                "nom='" + nom + '\'' +
                '}';
    }
}
