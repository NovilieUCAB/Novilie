package BBDD;

public class ClientePotencialEntity extends ClienteEntity{
    private boolean operacion;

    public ClientePotencialEntity(int cedula, String nombre, String apellido, int edad, int diaNacimiento, int mesNacimiento,
                                  int añoNacimiento, String email, int telefono, String trabajo, String parroquiaDireccion,
                                  String municipioDireccion, String estadoDireccion, String ciudadDireccion, String direccion,
                                  boolean operacion) {

        super(cedula, nombre, apellido, edad, diaNacimiento, mesNacimiento, añoNacimiento, email, telefono, trabajo,
                parroquiaDireccion, municipioDireccion, estadoDireccion, ciudadDireccion, direccion);
        this.operacion=operacion;
    }

    public boolean getOperacion() {
        return operacion;
    }

    public void setOperacion(boolean operacion) {
        this.operacion = operacion;
    }
}
