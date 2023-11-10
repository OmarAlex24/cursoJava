package presencial;

public class CajaAhorro extends  Cuenta{
    private static final Double Interes = 1.2;

    @Override
    public void extraer(Double monto) {
        if(saldo>=monto){
            saldo-=monto;
            System.out.println("Se extrajo de su caja de ahorro: " + monto);
            System.out.println("Tiene en su cuenta: "+saldo);
        } else {
            System.out.println("No se puede extraer");
            System.out.println("Ingreso un monto mayor a extraer que su saldo");
        }
    }
    public void cobrarIntereses(){
        saldo += saldo*(Interes/100);
    }
}
