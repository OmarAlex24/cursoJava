package presencial;

public class ObjetoGrafico {
    private Integer posx;
    private Integer posy;
    private Character direccion;

    public ObjetoGrafico(Integer posx, Integer posy, Character direccion) {
        this.posx = posx;
        this.posy = posy;
        this.direccion = direccion;
    }

    public void irA(Integer posx, Integer posy, Character direccion){
        System.out.println("Mover navecita hacia x: "+posx+" y: "+posy);
        this.posx = posx;
        this.posy = posy;
        this.direccion = direccion;
    }
}
