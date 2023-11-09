package presencial;

public abstract class embarcacion {
    private capitan Capitan;
    private Integer precioBase;
    private Integer valorAdicional;
    private Integer anoFabricacion;
    private Integer eslora;

    public embarcacion(capitan capitan, Integer precioBase, Integer valorAdicional, Integer anoFabricacion, Integer eslora) {
        Capitan = capitan;
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.anoFabricacion = anoFabricacion;
        this.eslora = eslora;
    }

    public Integer calcularAlquiler(){
        if(this.anoFabricacion > 2020){
            this.precioBase += this.valorAdicional;
        }
        return this.precioBase;
    }
}

