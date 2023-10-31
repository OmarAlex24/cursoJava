public class Main {
    public static void main(String[] args) {
        String nombre = "Omar";
        int cantidad;
        char inicial;

        cantidad = nombre.length();

        nombre = nombre.toUpperCase();

        if(nombre.equals("OMAR")){
            System.out.println("Se paso a mayuscula");
        }
        inicial = nombre.charAt(0);

        String nombre2 = null;
//       Si la variable es null no se pueden ocupar metodos

//       if(nombre2.equals(null)){
//           System.out.println("Variable vacia");
//       }

        if(nombre2 == null){
            System.out.println("Variable vacia");
        }

    }
}