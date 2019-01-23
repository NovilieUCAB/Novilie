package BBDD;

public class AsesorInmobiliarioEntity {
    private int cedula;
    private String nombre;
    private String apellido;
    private int diaNacimiento;
    private int mesNacimiento;
    private int anhoNacimiento;
    private String parroquiaDireccion;
    private String municipioDireccion;
    private String estadoDireccion;
    private String ciudadDireccion;
    private String direccion;
    private String email;

    public AsesorInmobiliarioEntity(int cedula, String nombre, String apellido, int diaNacimiento, int mesNacimiento,
                                    int anhoNacimiento, String parroquiaDireccion, String municipioDireccion,
                                    String estadoDireccion, String ciudadDireccion, String direccion, String email) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.diaNacimiento = diaNacimiento;
        this.mesNacimiento = mesNacimiento;
        this.anhoNacimiento = anhoNacimiento;
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

    public int getAnhoNacimiento() {
        return anhoNacimiento;
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

    public void setAnhoNacimiento(int anhoNacimiento) {
        this.anhoNacimiento = anhoNacimiento;
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


