package presencial;

import java.util.Date;

public class ImpresoraEpson extends Impresora{

    public ImpresoraEpson(String modelo, String tipoConexion, Date fechaFabricacion, Integer hojasDisponibles, Double porcentajeTinta) {
        super(modelo, tipoConexion, fechaFabricacion, hojasDisponibles, porcentajeTinta);
    }

    @Override
    public String imprimir() {
        if (tienePapel() && !necesitaTinta()){
            return "Imprimiendo epson";
        } else{
            return "Verifique papel y/o tinta";
        }
    }
}
