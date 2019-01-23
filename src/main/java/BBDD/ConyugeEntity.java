package Backend;

public class ConyugeEntity {
    int cedula;
    String nombre;
    String apellido;
    int edad;
    int diaNacimiento;
    int mesNacimiento;
    int añoNacimiento;
    String email;
    int telefono;
    String trabajo;

    public ConyugeEntity(int cedula, String nombre, String apellido, int edad, int dia, int mes, int año, String email, int telefono, String trabajo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.añoNacimiento=año;
        this.mesNacimiento=mes;
        this.diaNacimiento=dia;
        this.email = email;
        this.telefono = telefono;
        this.trabajo = trabajo;
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

    public int getEdad() {
        return edad;
    }

    public int getDiaNacimiento() { return diaNacimiento; }

    public int getMesNacimiento() { return mesNacimiento; }

    public int getAñoNacimiento() { return añoNacimiento; }

    public String getEmail() {
        return email;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getTrabajo() { return trabajo; }

    public void setCedula(int cedula) { this.cedula = cedula; }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDiaNacimiento(int diaNacimiento) { this.diaNacimiento = diaNacimiento; }

    public void setMesNacimiento(int mesNacimiento) { this.mesNacimiento = mesNacimiento; }

    public void setAñoNacimiento(int añoNacimiento) { this.añoNacimiento = añoNacimiento; }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }
}

