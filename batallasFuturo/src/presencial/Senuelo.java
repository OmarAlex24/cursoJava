package presencial;

public class Senuelo extends SistemaArmas implements Ocultar{
    @Override
    public void ocultarse() {
        System.out.println("Senuelo ocultandose");
    }

    @Override
    public void mostrar() {
        System.out.println("Robot senuelo tiene: "+this.getEnergia()+ " puntos de vida");
    }
}
