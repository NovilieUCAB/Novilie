package BBDD;

import java.util.ArrayList;

public class ClienteEntity {
    protected int cedula;
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected int diaNacimiento;
    protected int mesNacimiento;
    protected int añoNacimiento;
    protected String email;
    protected int telefono;
    protected String trabajo;
    protected String parroquiaDireccion;
    protected String municipioDireccion;
    protected String estadoDireccion;
    protected String ciudadDireccion;
    protected String direccion;
    protected ArrayList<Integer> telefonos= new ArrayList<>();

    public ClienteEntity(int cedula, String nombre, String apellido, int edad, int diaNacimiento, int mesNacimiento,
                         int añoNacimiento, String email, int telefono, String trabajo, String parroquiaDireccion,
                         String municipioDireccion, String estadoDireccion, String ciudadDireccion, String direccion) {

        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.diaNacimiento = diaNacimiento;
        this.mesNacimiento = mesNacimiento;
        this.añoNacimiento = añoNacimiento;
        this.email = email;
        this.telefono = telefono;
        this.trabajo = trabajo;
        this.parroquiaDireccion = parroquiaDireccion;
        this.municipioDireccion = municipioDireccion;
        this.estadoDireccion = estadoDireccion;
        this.ciudadDireccion = ciudadDireccion;
        this.direccion = direccion;
    }

    public int getCedula() { return cedula; }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public int getDiaNacimiento() {
        return diaNacimiento;
    }

    public int getMesNacimiento() { return mesNacimiento; }

    public int getAñoNacimiento() {
        return añoNacimiento;
    }

    public String getEmail() {
        return email;
    }

    public int getTelefono() { return telefono; }

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

    public void setCedula(int cedula) {
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

    public void setDiaNacimiento(int diaNacimiento) {
        this.diaNacimiento = diaNacimiento;
    }

    public void setMesNacimiento(int mesNacimiento) {
        this.mesNacimiento = mesNacimiento;
    }

    public void setAñoNacimiento(int añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefono(int telefono) {
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

    public void addTelefono(int telefono) {
        this.telefonos.add(telefono);
    }

    public void removeTelefono(int telefono) {
        this.telefonos.remove(telefono);
    }
}
