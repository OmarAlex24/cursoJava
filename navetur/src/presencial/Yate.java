package presencial;

public class Yate extends Embarcacion {
    public Integer camarotes;

    public Yate(presencial.Capitan capitan, Integer precioBase, Integer valorAdicional, Integer anoFabricacion, Integer eslora, Integer camarotes) {
        super(capitan, precioBase, valorAdicional, anoFabricacion, eslora);
        this.camarotes = camarotes;
    }

//    En el caso de los yates debe ser posible compararlos.
//    Un yate tiene mayor lujo que otro si tiene mayor cantidad de camarotes.
    public boolean comparar(Yate otroYate){
        return this.camarotes > otroYate.camarotes;
    }
}
