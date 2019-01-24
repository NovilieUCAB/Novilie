package BBDD.ModelosBD;

import BBDD.Fecha;
import BBDD.Telefono;

import java.util.ArrayList;
import java.util.List;

public class ClientePropietarioEntity extends ClienteEntity {
    private ArrayList<Integer> inmuebles = new ArrayList<>();

    public ClientePropietarioEntity(String cedula, String nombre, String apellido, Fecha fechaNacimiento, String email,
                                  String trabajo, String estadoDireccion, String ciudadDireccion, String direccion, ArrayList<Integer> inmuebles){
        super(cedula,nombre,apellido,fechaNacimiento,email,trabajo,estadoDireccion,ciudadDireccion,direccion);
        this.inmuebles = inmuebles;
    }

    public ClientePropietarioEntity(String cedula, String nombre, String apellido, Fecha fechaNacimiento, String email,
                                  List<Telefono> telefono, String trabajo, String parroquiaDireccion, String municipioDireccion,
                                  String estadoDireccion, String ciudadDireccion, String direccion, ArrayList<Integer> inmuebles){
        super(cedula,nombre,apellido,fechaNacimiento,email,telefono,trabajo,parroquiaDireccion,municipioDireccion,estadoDireccion,ciudadDireccion,direccion);
        this.inmuebles = inmuebles;
    }

    /*public ClientePropietarioEntity(int cedula, String nombre, String apellido, int edad, int diaNacimiento, int mesNacimiento,
                                    int anhoNacimiento, String email, int telefono, String trabajo, String parroquiaDireccion,
                                    String municipioDireccion, String estadoDireccion, String ciudadDireccion, String direccion,
                                    float precioInicial) {
        super(cedula, nombre, apellido, edad, diaNacimiento, mesNacimiento, anhoNacimiento, email, telefono, trabajo,
                parroquiaDireccion, municipioDireccion, estadoDireccion, ciudadDireccion, direccion);
    }*/

    public void addInmueble(int inmueble) {
        this.inmuebles.add(inmueble);
    }

    public void removeInmueble(int inmueble) {
        this.inmuebles.remove(inmueble);
    }

    @Override
    public String toString() {
        return "ClientePropietarioEntity{" +
                "inmuebles=" + inmuebles.toString() +
                '}';
    }
}
