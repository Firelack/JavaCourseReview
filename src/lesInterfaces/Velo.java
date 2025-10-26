// Un vélo ne peut être que réparé (il n'a pas de moteur)
public class Velo implements Reparable {

    @Override
    public void changerRoue() {
        System.out.println("On change la roue avant du vélo.");
    }
    
    // On peut aussi redéfinir la méthode par défaut
    @Override
    public void verifierPression() {
        System.out.println("Vérification de la pression des pneus du vélo.");
    }
}