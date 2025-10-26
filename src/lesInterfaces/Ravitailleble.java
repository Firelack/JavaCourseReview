// Interface pour tout ce qui peut être ravitaillé
public interface Ravitailleble {
    // Les méthodes d'interface sont publiques et abstraites par défaut
    void faireLePlein(int quantite);
    int getPourcentageCarburant();
}