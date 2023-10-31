package presencial;

public class Nave extends ObjetoGrafico{
    private Double velocidad;
    private Integer vida = 100;

    public Nave(Integer posx, Integer posy, Character direccion, Double velocidad, Integer vida) {
        super(posx, posy, direccion);
        this.velocidad = velocidad;
        this.vida = vida;
    }
    public Nave(Integer posx, Integer posy, Character direccion, Double velocidad) {
        super(posx, posy, direccion);
        this.velocidad = velocidad;
    }

    public void irA(Integer posx, Integer posy, Character direccion){
        if (!this.direccion.equals(direccion)){
            System.out.println("Girar hacia "+direccion);
        }
        System.out.println("Mover navecita hacia x: "+posx+" y: "+posy);
        this.posx = posx;
        this.posy = posy;
        this.direccion = direccion;
    }
}
