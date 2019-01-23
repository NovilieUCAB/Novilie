package BBDD;

public class UsuarioSistemaEntity {
    private String nombre;
    private String Apellido;
    private String nombreUsuario;
    private int nivelPermiso;
    private String contraseña;
    private String email;

    public UsuarioSistemaEntity(String nombre, String apellido, String nombreUsuario, int nivelPermiso,
                                String contraseña, String email) {

        this.nombre = nombre;
        Apellido = apellido;
        this.nombreUsuario = nombreUsuario;
        this.nivelPermiso = nivelPermiso;
        this.contraseña = contraseña;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public int getNivelPermiso() {
        return nivelPermiso;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getEmail() {
        return email;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setNivelPermiso(int nivelPermiso) {
        this.nivelPermiso = nivelPermiso;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
