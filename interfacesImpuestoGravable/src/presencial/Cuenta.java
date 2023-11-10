package presencial;

public abstract class Cuenta {
    protected double saldo;

    public abstract void extraer(Double monto);

    public void depositar(Double monto){
        saldo += monto;
    }
    public void informarSaldo(){
        System.out.println("Tienes: $"+saldo);
    }
}
