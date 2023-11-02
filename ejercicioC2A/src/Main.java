public class Main {
    public static void main(String[] args) {
        String string1 = "Hola";
        String string2 = "Hola";

        if(string1.equals(string2)){
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }

        Integer num1 = 6;
        Integer num2 = 5;

        int comparacion = num1.compareTo(num2);

        if(comparacion == 1){
            System.out.println("El valor 1 es mayor que el valor 2");
        } else if (comparacion == 0) {
            System.out.println("Son iguales");
        } else {
            System.out.println( "El valor 1 es menor que el valor 2");
        }
    }
}