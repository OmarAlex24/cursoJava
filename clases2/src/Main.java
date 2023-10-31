public class Main {
    public static void main(String[] args) {

        Integer valor1 = 50;
        Integer valor2 = 50;
        int comparar;

        comparar = valor1.compareTo(valor2);

        if(comparar == 0){
            System.out.println("Los valores son iguales");
        } else if (comparar == 1) {
            System.out.println("Valor 1 es mayor");
        } else {
            System.out.println("Valor 2 es mayor");
        }
    }
}