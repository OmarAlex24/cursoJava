package presencial;

public class Main {
    public static void main(String[] args) {
        CajaAhorro miCajaAhorro = new CajaAhorro();
        CuentaCorriente miCuentaCorriente = new CuentaCorriente(500.0);

        miCajaAhorro.depositar(500.0);
        miCajaAhorro.extraer(250.0);
        miCajaAhorro.informarSaldo();

        miCuentaCorriente.depositar(500.0);
        miCuentaCorriente.extraer(450.0);
        miCuentaCorriente.gravar(10.0);
        miCuentaCorriente.informarSaldo();
    }
}
