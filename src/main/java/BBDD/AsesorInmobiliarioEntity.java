package BBDD;

public class AsesorInmobiliarioEntity {
    int cedula;
    String nombre;
    String apellido;
    int diaNacimiento;
    int mesNacimiento;
    int añoNacimiento;
    String parroquiaDireccion;
    String municipioDireccion;
    String estadoDireccion;
    String ciudadDireccion;
    String direccion;
    String email;

    public AsesorInmobiliarioEntity(int cedula, String nombre, String apellido, int diaNacimiento, int mesNacimiento,
                                    int añoNacimiento, String parroquiaDireccion, String municipioDireccion,
                                    String estadoDireccion, String ciudadDireccion, String direccion, String email) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.diaNacimiento = diaNacimiento;
        this.mesNacimiento = mesNacimiento;
        this.añoNacimiento = añoNacimiento;
        this.parroquiaDireccion = parroquiaDireccion;
        this.municipioDireccion = municipioDireccion;
        this.estadoDireccion = estadoDireccion;
        this.ciudadDireccion = ciudadDireccion;
        this.direccion = direccion;
        this.email = email;
    }

    public int getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getDiaNacimiento() {
        return diaNacimiento;
    }

    public int getMesNacimiento() {
        return mesNacimiento;
    }

    public int getAñoNacimiento() {
        return añoNacimiento;
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

    public String getEmail() {
        return email;
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

    public void setDiaNacimiento(int diaNacimiento) {
        this.diaNacimiento = diaNacimiento;
    }

    public void setMesNacimiento(int mesNacimiento) {
        this.mesNacimiento = mesNacimiento;
    }

    public void setAñoNacimiento(int añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
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

    public void setEmail(String email) {
        this.email = email;
    }
}


