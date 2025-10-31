package exceptions;

// Notre propre classe d'exception "checked"
// On hérite de Exception (pas de RuntimeException) 
public class DebitImpossibleException extends Exception {
    
    // Constructeur qui prend un message d'erreur
    public DebitImpossibleException(String message) {
        super(message); // Appelle le constructeur de la classe Exception
    }
}