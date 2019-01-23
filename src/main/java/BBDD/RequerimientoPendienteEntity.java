package BBDD;

public class RequerimientoPendienteEntity {
    private String numReferencia;
    private int cedulaCliente;
    private int telefono;
    private boolean operacion;
    private boolean atendido;

    public RequerimientoPendienteEntity(String numReferencia, int cedulaCliente, int telefono, boolean operacion,
                                        boolean atendido) {
        this.numReferencia = numReferencia;
        this.cedulaCliente = cedulaCliente;
        this.telefono = telefono;
        this.operacion = operacion;
        this.atendido = atendido;
    }

    public String getNumReferencia() {
        return numReferencia;
    }

    public int getCedulaCliente() {
        return cedulaCliente;
    }

    public int getTelefono() {
        return telefono;
    }

    public boolean isOperacion() {
        return operacion;
    }

    public boolean isAtendido() {
        return atendido;
    }

    public void setNumReferencia(String numReferencia) {
        this.numReferencia = numReferencia;
    }

    public void setCedulaCliente(int cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setOperacion(boolean operacion) {
        this.operacion = operacion;
    }

    public void setAtendido(boolean atendido) {
        this.atendido = atendido;
    }
}
