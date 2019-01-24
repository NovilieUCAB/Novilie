package BBDD.ModelosBD;

import BBDD.Fecha;
import BBDD.Telefono;

import java.util.List;

public class ConyugeEntity {
    String cedula;
    String nombre;
    String apellido;
    int edad;
    Fecha fechaNacimiento;
    String email;
    List<Telefono> telefono;
    String trabajo;

    public ConyugeEntity(String cedula, String nombre, String apellido, int edad, Fecha fechaNacimiento, String email, String trabajo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = ClienteEntity.calculateAge(fechaNacimiento);
        this.fechaNacimiento = fechaNacimiento;
        this.email = email;
        this.trabajo = trabajo;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }


    public String getEmail() {
        return email;
    }

    public List<Telefono> getTelefono() {
        return telefono;
    }

    public String getTrabajo() { return trabajo; }

    public void setCedula(String cedula) { this.cedula = cedula; }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefono(List<Telefono> telefono) {
        this.telefono = telefono;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    @Override
    public String toString() {
        return "ConyugeEntity{" +
                "cedula=" + cedula +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", fechaNacimiento=" + fechaNacimiento.getDia() +"/" + fechaNacimiento.getMes() + "/" + fechaNacimiento.getAnio() + "/" +
                ", email='" + email + '\'' +
                ", telefono=" + telefono.get(0) +
                ", trabajo='" + trabajo + '\'' +
                '}';
    }
}

