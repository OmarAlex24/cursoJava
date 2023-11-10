package presencial;

public class CuentaCorriente extends Cuenta implements ImpuestoGravable{
    private Double descubiertoPermitido;

    public CuentaCorriente(Double descubiertoPermitido) {
        this.descubiertoPermitido = descubiertoPermitido;
    }

    @Override
    public void extraer(Double monto) {
        if(saldo>=monto){
            saldo-=monto;
            System.out.println("Se extrajo de su cuenta corriente: " + monto);
            System.out.println("Tiene en su cuenta: "+saldo);
        } else {
            System.out.println("No se puede extraer");
            System.out.println("Ingreso un monto mayor a extraer que su saldo");
        }
    }
    @Override
    public Double gravar(Double porcentaje) {
        Double monto = saldo*(porcentaje/100);
        saldo -= monto;
        return monto;
    }
}
