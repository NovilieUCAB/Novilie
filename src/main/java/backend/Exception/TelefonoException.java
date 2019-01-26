package backend.Exception;

public class TelefonoException extends Exception{

    public TelefonoException(){
        super("Número incorrecto. Por favor, introduzca un número válido");
    }
}
