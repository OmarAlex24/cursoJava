package presencial;

public class Contenedor implements Comparable<Contenedor> {
    private Integer ID;
    private String paisProcedencia;
    private Boolean materialesPeligrosos;
    public Contenedor(Integer ID, String paisProcedencia, Boolean materialesPeligrosos) {
        this.ID = ID;
        this.paisProcedencia = paisProcedencia;
        this.materialesPeligrosos = materialesPeligrosos;
    }

    public Integer getID() {
        return ID;
    }

    public Boolean getMaterialesPeligrosos() {
        return materialesPeligrosos;
    }

    public String getPaisProcedencia() {
        return paisProcedencia;
    }

    @Override
    public String toString() {
        return "Contenedor{" +
                "ID=" + ID +
                ", paisProcedencia='" + paisProcedencia + '\'' +
                ", materialesPeligrosos=" + materialesPeligrosos +
                '}';
    }
    @Override
    public int compareTo(Contenedor otroContenedor) {
        return Integer.compare(this.ID, otroContenedor.getID());
    }
}
