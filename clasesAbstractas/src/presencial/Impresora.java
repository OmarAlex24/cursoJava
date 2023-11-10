package presencial;

import java.util.Date;

public abstract class Impresora {
    private String modelo;
    private String tipoConexion;
    private Date fechaFabricacion;
    private Integer hojasDisponibles;
    protected Double porcentajeTinta;

    public Impresora(String modelo, String tipoConexion, Date fechaFabricacion, Integer hojasDisponibles, Double porcentajeTinta) {
        this.modelo = modelo;
        this.tipoConexion = tipoConexion;
        this.fechaFabricacion = fechaFabricacion;
        this.hojasDisponibles = hojasDisponibles;
        this.porcentajeTinta = porcentajeTinta;
    }

    public boolean tienePapel(){
        return hojasDisponibles > 0;
    }

    public boolean necesitaTinta(){
        return porcentajeTinta <= 5;
    }

    public abstract String imprimir();
}
