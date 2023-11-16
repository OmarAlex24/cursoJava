package presencial;

public class Main {
    public static void main(String[] args) {
        Contenedor contenedor1 = new Contenedor(3,"EUA",true);
        Contenedor contenedor2 = new Contenedor(4,"Canada",false);
        Contenedor contenedor3 = new Contenedor(1,"Desconocido",false);
        Contenedor contenedor4 = new Contenedor(2, "Desconocido", true);

        Puerto puerto = new Puerto();

        puerto.agregarContenedores(contenedor1);
        puerto.agregarContenedores(contenedor2);
        puerto.agregarContenedores(contenedor3);
        puerto.agregarContenedores(contenedor4);

        puerto.mostrarContenedoresOrdenados();

        System.out.println(puerto.mostrarContenedoresPeligrosos());
    }

}
