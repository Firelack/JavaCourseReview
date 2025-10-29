package classesInternes;

// 2. EXEMPLE DE CLASSE INTERNE STATIQUE
public class GestionCoordonnees {
    
    // La classe Paire est un détail d'implémentation de GestionCoordonnees.
    // On la cache à l'intérieur avec "private static".
    // "static" car une "Paire" n'a pas besoin de savoir à quelle "GestionCoordonnees" elle appartient.
    private static class Paire {
        private int x;
        private int y;

        public Paire(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "(" + x + ", " + y + ")";
        }
    }

    // Le reste de la classe GestionCoordonnees utilise sa classe interne privée
    private Paire[] coordonnees;
    
    public GestionCoordonnees() {
        coordonnees = new Paire[5]; // Crée un tableau de Paire
    }

    public void ajouterCoordonnee(int index, int x, int y) {
        if (index >= 0 && index < coordonnees.length) {
            coordonnees[index] = new Paire(x, y); // Crée une instance de Paire
        }
    }

    public void afficherCoordonnees() {
        System.out.println("Liste des coordonnées :");
        for(Paire p : coordonnees) {
            if (p != null) {
                System.out.println(p); // Appelle le p.toString()
            }
        }
    }
}