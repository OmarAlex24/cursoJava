package presencial;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n<----------------Robot Pesado------------------>");

        RobotPesado robotPesado = new RobotPesado();
        robotPesado.mostrar();
        robotPesado.atacar();
        robotPesado.defender();
        robotPesado.volar();

        System.out.println("\n<----------------Robot Liviano------------------>");
        RobotLiviano robotLiviano = new RobotLiviano();
        robotLiviano.mostrar();
        robotLiviano.atacar();
        robotLiviano.defender();
        robotLiviano.volar();

        System.out.println("\n<----------------Robot Senuelo------------------>");
        Senuelo robotSenuelo = new Senuelo();
        robotSenuelo.mostrar();
        robotSenuelo.ocultarse();

        System.out.println("\n<----------------Tanque------------------>");
        Tanque miTanque = new Tanque();
        miTanque.mostrar();
        miTanque.atacar();
        miTanque.defender();
    }
}
