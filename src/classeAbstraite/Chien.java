package classeAbstraite;

public class Chien extends Animal {
    public Chien(String nom) {
        super(nom);
    }

    // On doit redéfinir la méthode abstraite "parler"
    @Override // On redéfini une méthode donc on met Override
    public void parler() {
        System.out.println(nom + " dit : Ouaf !");
    }
}