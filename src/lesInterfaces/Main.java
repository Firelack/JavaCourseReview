public class Main {
    public static void main(String[] args) {
        Voiture maVoiture = new Voiture();
        Velo monVelo = new Velo();

        System.out.println("--- Actions sur la voiture ---");
        maVoiture.faireLePlein(30);
        maVoiture.changerRoue();
        maVoiture.verifierPression(); // Utilise la méthode par défaut

        System.out.println("\n--- Actions sur le vélo ---");
        // monVelo.faireLePlein(10); // ❌ ERREUR ! Un Velo n'est pas Ravitailleble
        monVelo.changerRoue();
        monVelo.verifierPression(); // Utilise la méthode redéfinie
        
        System.out.println("\n--- Polymorphisme avec interfaces ---");
        // On peut créer un tableau d'objets "Reparable"
        Reparable[] garage = {maVoiture, monVelo};
        
        for (Reparable objet : garage) {
            System.out.print("Objet en cours de réparation : ");
            objet.changerRoue();
        }
    }
}