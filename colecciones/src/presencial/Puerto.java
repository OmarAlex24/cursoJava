package presencial;

import java.util.ArrayList;
import java.util.List;

public class Puerto {
    private List<Contenedor> listaContenedores = new ArrayList<>();

    public void agregarContenedores(Contenedor contenedor){
        listaContenedores.add(contenedor);
    }
    public void mostrarContenedoresOrdenados(){
        listaContenedores.stream().sorted().forEach(contenedor -> System.out.println(contenedor.toString()));
    }
    public int mostrarContenedoresPeligrosos(){
        return (int)listaContenedores.stream().filter(contenedor -> contenedor.getMaterialesPeligrosos() && contenedor.getPaisProcedencia().equals("Desconocido")).count();
    }
}
