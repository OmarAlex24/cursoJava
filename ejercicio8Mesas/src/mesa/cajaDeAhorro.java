package mesa;

public class cajaDeAhorro extends Cuenta {
    private Double tasaInteres;

    @Override
    public void depositar(double cantidad) {
        super.depositar(cantidad);
    }

    @Override
    public void extraerEfectivo(double cantidad) {
        super.extraerEfectivo(cantidad);
    }
    private void cobrarInteres(){}
}
