package presencial;

public class Velero extends Embarcacion {

    private Integer mastiles;

    public Velero(presencial.Capitan capitan, Integer precioBase, Integer valorAdicional, Integer anoFabricacion, Integer eslora, Integer mastiles) {
        super(capitan, precioBase, valorAdicional, anoFabricacion, eslora);
        this.mastiles = mastiles;
    }

    public boolean evaluar(){
        return this.mastiles > 4;
    }
}
