package classeAbstraite;

/*
Une classe abstraite est une classe qu’on ne peut pas instancier directement.
➡️ Elle sert de modèle commun à plusieurs sous-classes.

Elle peut contenir :
- des méthodes normales (avec un corps) ;
- des méthodes abstraites (sans corps, à définir dans les classes filles).
👉 C’est un entre-deux entre une classe normale et une interface.
 */

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
}
