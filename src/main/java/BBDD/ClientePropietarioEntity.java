package BBDD;

import java.util.ArrayList;

public class ClientePropietarioEntity extends ClienteEntity {
    ArrayList<InmuebleEntity> inmuebles = new ArrayList<InmuebleEntity>();


    public ClientePropietarioEntity(int cedula, String nombre, String apellido, int edad, int diaNacimiento, int mesNacimiento,
                                    int añoNacimiento, String email, int telefono, String trabajo, String parroquiaDireccion,
                                    String municipioDireccion, String estadoDireccion, String ciudadDireccion, String direccion,
                                    float precioInicial) {
        super(cedula, nombre, apellido, edad, diaNacimiento, mesNacimiento, añoNacimiento, email, telefono, trabajo,
                parroquiaDireccion, municipioDireccion, estadoDireccion, ciudadDireccion, direccion);
    }

    public void addInmueble(InmuebleEntity inmueble) {
        this.inmuebles.add(inmueble);
    }

    public void removeInmueble(InmuebleEntity inmueble) {
        this.inmuebles.remove(inmueble);
    }
}
