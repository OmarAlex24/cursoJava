package presencial;

public class Tanque extends SistemaArmas implements Atacar,Defender{
    @Override
    public void atacar() {
        System.out.println("Tanque atacando");
    }

    @Override
    public void defender() {
        System.out.println("Tanque defiendose");
    }

    @Override
    public void mostrar() {
        System.out.println("Tanque tiene: "+this.getEnergia()+ " puntos de vida");
    }
}
