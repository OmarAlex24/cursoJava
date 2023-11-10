package presencial;

public class RobotPesado extends SistemaArmas implements Atacar ,Defender,Volar{
    @Override
    public void atacar() {
        System.out.println("Robot pesado atacando");
    }
    @Override
    public void defender() {
        System.out.println("Robot pesado defendiendo");
    }

    @Override
    public void mostrar() {
        System.out.println("Robot pesado tiene: "+this.getEnergia()+ " puntos de vida");
    }
    @Override
    public void volar() {
        System.out.println("Robot pesado empieza a volar");
    }
}
