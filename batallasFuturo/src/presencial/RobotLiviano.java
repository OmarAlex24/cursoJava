package presencial;

public class RobotLiviano extends SistemaArmas implements Volar,Atacar,Defender{

    @Override
    public void mostrar() {
        System.out.printf("Robot liviano tiene: "+this.getEnergia()+ " puntos de vida");
    }
    @Override
    public void atacar() {
        System.out.println("Robot liviando atacando");
    }

    @Override
    public void defender() {
        System.out.println("Robot liviano defendiendo");
    }

    @Override
    public void volar() {
        System.out.println("Robot liviano empezando a volar");
    }
}
