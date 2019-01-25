package BBDD;
import backend.Exception.TelefonoException;

public class Telefono {
    private String telefono;
    private static String pattern = "[0-9]{4}-[0-9]{7}";

    public Telefono(){}

    public Telefono(String telefono) throws TelefonoException{
        if(!verifyTlf(telefono)){
            throw new TelefonoException();
        }else {
            this.telefono = telefono;
        }
    }

    public boolean verifyTlf(String telefono){
        return telefono.matches(getPattern());
    }

    private static String getPattern() {
        return pattern;
    }

    public String getTelefono() {
        return telefono;
    }
}
