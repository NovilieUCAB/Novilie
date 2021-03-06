package BBDD.ModelosBD;

import BBDD.Fecha;
import BBDD.Telefono;

import java.util.ArrayList;
import java.util.List;

public class ClientePropietarioEntity extends ClienteEntity {
    private ArrayList<String> inmuebles = new ArrayList<>();

    public ClientePropietarioEntity(String cedula, String nombre, String apellido,Fecha fechaAgregado, Fecha fechaNacimiento, String email,
                                    String trabajo, String estadoDireccion, String ciudadDireccion, String direccion, String operacion,String cedulaConyuge, String cedulaAsesorEncargado){
        super(cedula,nombre,apellido,fechaAgregado,fechaNacimiento,email,trabajo,estadoDireccion,ciudadDireccion,direccion, cedulaConyuge, cedulaAsesorEncargado);
        this.inmuebles = inmuebles;
    }

    public ClientePropietarioEntity(String cedula, String nombre, String apellido,Fecha fechaNacimiento, String email,
                                    List<Telefono> telefono, String trabajo, String parroquiaDireccion, String municipioDireccion,
                                    String estadoDireccion, String ciudadDireccion, String direccion, String operacion,String cedulaConyuge, String cedulaAsesorEncargado){
        super(cedula,nombre,apellido,fechaNacimiento,email,telefono,trabajo,parroquiaDireccion,municipioDireccion,estadoDireccion,ciudadDireccion,direccion,cedulaConyuge,cedulaAsesorEncargado);
        this.inmuebles = inmuebles;
    }


    public void addInmueble(String inmueble) {
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
