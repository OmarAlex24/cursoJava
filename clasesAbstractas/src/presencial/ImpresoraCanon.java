package presencial;

import java.util.Date;

public class ImpresoraCanon extends Impresora{
    public ImpresoraCanon(String modelo, String tipoConexion, Date fechaFabricacion, Integer hojasDisponibles, Double porcentajeTinta) {
        super(modelo, tipoConexion, fechaFabricacion, hojasDisponibles, porcentajeTinta);
    }

    @Override
    public boolean necesitaTinta() {
        return porcentajeTinta <= 10;
    }

    @Override
    public String imprimir() {
        return null;
    }
}
