package presencial;

public class velero extends embarcacion{

    private Integer mastiles;

    public velero(capitan capitan, Integer precioBase, Integer valorAdicional, Integer anoFabricacion, Integer eslora, Integer mastiles) {
        super(capitan, precioBase, valorAdicional, anoFabricacion, eslora);
        this.mastiles = mastiles;
    }

    public boolean evaluar(){
        return this.mastiles > 4;
    }
}
