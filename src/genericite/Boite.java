package genericite;

/**
 * 1. EXEMPLE DE CLASSE GÉNÉRIQUE
 *
 * Une classe "Boite" générique.
 * Le <T> est un paramètre de type qui sera remplacé
 * par un vrai type (ex: String, Integer) lors de l'utilisation.
 *
 */
public class Boite<T> {
    private T contenu;

    public Boite(T contenu) {
        this.contenu = contenu;
    }

    public T getContenu() {
        return contenu;
    }

    public void setContenu(T contenu) {
        this.contenu = contenu;
    }

    @Override
    public String toString() {
        // .getClass().getSimpleName() donne le nom du type (String, Integer...)
        return "Boite contenant un objet de type " + contenu.getClass().getSimpleName();
    }
}