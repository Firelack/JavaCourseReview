// Une voiture peut être ravitaillée ET réparée
public class Voiture implements Ravitailleble, Reparable {
    
    private int carburant = 50; // en %

    @Override
    public void faireLePlein(int quantite) {
        carburant += quantite;
        if (carburant > 100) carburant = 100;
        System.out.println("La voiture a " + carburant + "% de carburant.");
    }

    @Override
    public int getPourcentageCarburant() {
        return carburant;
    }

    @Override
    public void changerRoue() {
        System.out.println("On change les 4 roues de la voiture.");
    }
}