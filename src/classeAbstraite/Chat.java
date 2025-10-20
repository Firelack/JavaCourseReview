package classeAbstraite;

public class Chat extends Animal {
    public Chat(String nom) {
        super(nom);
    }

    @Override
    public void parler() {
        System.out.println(nom + " dit : Miaou !");
    }

    @Override
    public String toString() {
        return super.toString() + " Chat{}"; }
}
