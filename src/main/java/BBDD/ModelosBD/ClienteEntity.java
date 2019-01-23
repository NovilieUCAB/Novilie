package BBDD.ModelosBD;

import BBDD.Fecha;
import BBDD.Telefono;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class ClienteEntity {

    String cedula;
    String nombre;
    String apellido;
    int edad;
    Fecha fechaNacimiento;
    String email;
    List<Telefono> telefono;
    String trabajo;
    String parroquiaDireccion;
    String municipioDireccion;
    String estadoDireccion;
    String ciudadDireccion;
    String direccion;

    public ClienteEntity(String cedula, String nombre, String apellido, Fecha fechaNacimiento, String email,
                         String trabajo, String estadoDireccion, String ciudadDireccion, String direccion) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.email = email;
        this.trabajo = trabajo;
        this.estadoDireccion = estadoDireccion;
        this.ciudadDireccion = ciudadDireccion;
        this.direccion = direccion;
        this.edad = calculateAge(fechaNacimiento);
    }

    public ClienteEntity(String cedula, String nombre, String apellido,Fecha fechaNacimiento, String email,
                         List<Telefono> telefono, String trabajo, String parroquiaDireccion, String municipioDireccion,
                         String estadoDireccion, String ciudadDireccion, String direccion) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = calculateAge(fechaNacimiento);
        this.fechaNacimiento = fechaNacimiento;
        this.email = email;
        this.telefono = telefono;
        this.trabajo = trabajo;
        this.parroquiaDireccion = parroquiaDireccion;
        this.municipioDireccion = municipioDireccion;
        this.estadoDireccion = estadoDireccion;
        this.ciudadDireccion = ciudadDireccion;
        this.direccion = direccion;
    }

    public String getCedula() { return cedula; }

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

    public List<Telefono> getTelefono() { return telefono; }

    public String getTrabajo() {
        return trabajo;
    }

    public String getParroquiaDireccion() {
        return parroquiaDireccion;
    }

    public String getMunicipioDireccion() {
        return municipioDireccion;
    }

    public String getEstadoDireccion() {
        return estadoDireccion;
    }

    public String getCiudadDireccion() {
        return ciudadDireccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

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

    public void setParroquiaDireccion(String parroquiaDireccion) {
        this.parroquiaDireccion = parroquiaDireccion;
    }

    public void setMunicipioDireccion(String municipioDireccion) {
        this.municipioDireccion = municipioDireccion;
    }

    public void setEstadoDireccion(String estadoDireccion) {
        this.estadoDireccion = estadoDireccion;
    }

    public void setCiudadDireccion(String ciudadDireccion) {
        this.ciudadDireccion = ciudadDireccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Calcula la edad a partir de la fecha de nacimiento
     * @param fechaNacimiento instancia de la clase Fecha
     * @return numero que representa la edad
     */
    int calculateAge(Fecha fechaNacimiento){
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("d/M/yyyy");
        String s = "";
        if(fechaNacimiento.getDia()<10){
            s = "0"+fechaNacimiento.getDia();
        }
        if(fechaNacimiento.getMes()<10){
            s = s +"/0"+fechaNacimiento.getMes();
        }
        s = s + "/"+fechaNacimiento.getAnio();
        LocalDate fechaNac = LocalDate.parse(s, fmt);
        LocalDate ahora = LocalDate.now();

        Period periodo = Period.between(fechaNac, ahora);
        return periodo.getYears();
    }
}
