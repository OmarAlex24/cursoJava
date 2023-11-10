package mesa;
public abstract class Cuenta {
    private Cliente cliente;
    protected Double saldo;

    public Cuenta(Cliente cliente) {
        this.cliente = cliente;
        this.saldo = 0.0;
    }

    public void depositar(double cantidad){
        saldo += cantidad;
    }
    public boolean extraerEfectivo(double cantidad){
        if (saldo >= cantidad){
            saldo -= cantidad;
            return true;
        }
        return false;
    }
    public Double informarSaldo(){
        return saldo;
    }
}
