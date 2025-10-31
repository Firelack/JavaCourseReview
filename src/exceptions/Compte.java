package exceptions;

public class Compte {
    private double solde;

    public Compte(double soldeInitial) {
        this.solde = soldeInitial;
    }

    public double getSolde() {
        return solde;
    }

    // Cette méthode peut lancer une erreur "métier" (checked)
    // On doit donc la déclarer avec "throws"
    public void debiter(double montant) throws DebitImpossibleException {
        
        // On peut aussi throw une RuntimeException (pas besoin de "throws")
        if (montant < 0) {
            throw new IllegalArgumentException("Vous ne pouvez pas débiter un montant négatif");
        }
        
        if (montant > solde) {
            // On lève notre exception personnalisée 
            throw new DebitImpossibleException("Solde insuffisant ! Solde actuel : " + solde);
        }
        this.solde -= montant;
    }
}