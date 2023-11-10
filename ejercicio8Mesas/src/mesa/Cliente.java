package mesa;

public class Cliente {
    private Integer numCliente;
    private String apellido;
    private String DNI;
    private String CUIT;

    public Cliente(Integer numCliente, String apellido, String DNI, String CUIT) {
        this.numCliente = numCliente;
        this.apellido = apellido;
        this.DNI = DNI;
        this.CUIT = CUIT;
    }
}
