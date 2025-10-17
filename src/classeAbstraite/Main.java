package classeAbstraite;

public class Main {
    public static void main(String[] args) {
        // Animal a = new Animal("Bête"); ❌ INTERDIT — classe abstraite
        Animal chien = new Chien("Rex");
        Animal chat = new Chat("Mimi");

        chien.sePresenter(); // Je suis Rex
        chien.parler();      // Rex dit : Ouaf !

        chat.sePresenter();  // Je suis Mimi
        chat.parler();       // Mimi dit : Miaou !

        // On peut créer un tableau d'Animaux contenant des objets de types différents
        Animal[] mesAnimaux = {new Chien("Rexou"), new Chat("Minou")};

        for (Animal a : mesAnimaux) {
            a.parler(); // Le polymorphisme appelle la bonne méthode (Ouaf ou Miaou)
        }
    }
}
