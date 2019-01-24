package BBDD.ModelosBD;

import BBDD.Fecha;
import BBDD.Telefono;

import java.util.List;

public class ClientePotencialEntity extends ClienteEntity{
    private String operacion;

    public ClientePotencialEntity(String cedula, String nombre, String apellido, Fecha fechaNacimiento, String email,
                                  String trabajo, String estadoDireccion, String ciudadDireccion, String direccion, String operacion){
        super(cedula,nombre,apellido,fechaNacimiento,email,trabajo,estadoDireccion,ciudadDireccion,direccion);
        this.operacion = operacion;
    }

    public ClientePotencialEntity(String cedula, String nombre, String apellido,Fecha fechaNacimiento, String email,
    List<Telefono> telefono, String trabajo, String parroquiaDireccion, String municipioDireccion,
    String estadoDireccion, String ciudadDireccion, String direccion, String operacion){
        super(cedula,nombre,apellido,fechaNacimiento,email,telefono,trabajo,parroquiaDireccion,municipioDireccion,estadoDireccion,ciudadDireccion,direccion);
        this.operacion = operacion;
    }

    /*public ClientePotencialEntity(int cedula, String nombre, String apellido, int edad, int diaNacimiento, int mesNacimiento,
                                  int anhoNacimiento, String email, int telefono, String trabajo, String parroquiaDireccion,
                                  String municipioDireccion, String estadoDireccion, String ciudadDireccion, String direccion,
                                  boolean operacion) {

        super(cedula, nombre, apellido, edad, diaNacimiento, mesNacimiento, anhoNacimiento, email, telefono, trabajo,
                parroquiaDireccion, municipioDireccion, estadoDireccion, ciudadDireccion, direccion);
        this.operacion=operacion;
    }*/

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
}
