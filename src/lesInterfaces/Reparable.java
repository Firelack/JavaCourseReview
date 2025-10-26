// Interface pour tout ce qui peut être réparé
public interface Reparable {
    void changerRoue();
    
    // Exemple de méthode par défaut (Java 8+)
    default void verifierPression() {
        System.out.println("Vérification de la pression (par défaut)");
    }
}