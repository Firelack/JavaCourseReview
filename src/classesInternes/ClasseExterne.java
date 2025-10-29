package classesInternes;

// 1. EXEMPLE DE CLASSE INTERNE (NON-STATIQUE)
public class ClasseExterne {
    private String messagePrive = "Je suis un champ privé de la Classe Externe";

    // Voici la classe interne
    public class ClasseInterne {
        
        public void afficherMessagePrive() {
            // La classe interne peut accéder au champ privé de sa classe externe !
            // 
            System.out.println("La classe interne dit : " + messagePrive);
        }
    }

    // Méthode de la classe externe pour utiliser sa classe interne
    public void utiliserClasseInterne() {
        ClasseInterne interne = this.new ClasseInterne(); // Syntaxe d'instanciation [cite: 63]
        interne.afficherMessagePrive();
    }
}