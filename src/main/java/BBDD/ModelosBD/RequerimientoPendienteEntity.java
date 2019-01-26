package BBDD.ModelosBD;

import BBDD.Telefono;

public class RequerimientoPendienteEntity {
    private String numReferencia;
    private String cedulaCliente;
    private Telefono telefono;
    private String operacion;
    private boolean atendido;

    public RequerimientoPendienteEntity() {
    }

    public RequerimientoPendienteEntity(String numReferencia, String cedulaCliente, Telefono telefono, String operacion,
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

    public String getCedulaCliente() {
        return cedulaCliente;
    }

    public Telefono getTelefono() {
        return telefono;
    }

    public String isOperacion() {
        return operacion;
    }

    public boolean isAtendido() {
        return atendido;
    }

    public void setNumReferencia(String numReferencia) {
        this.numReferencia = numReferencia;
    }

    public void setCedulaCliente(String cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public void setTelefono(Telefono telefono) {
        this.telefono = telefono;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public void setAtendido(boolean atendido) {
        this.atendido = atendido;
    }
}
