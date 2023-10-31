public class Main {
    public static void main(String[] args) {
    //Definir dos números enteros. Asignarles un valor a cada uno. Comprobar si un número es
    //divisible por el segundo e indicar mediante un mensaje el resultado obtenido.
    //NOTA: Que sea divisible quiere decir que al dividir da un valor exacto, es decir, sin
    //decimales.
        int num1 = 30;
        int num2 = 15;

        if(num1%num2==0){
            System.out.println("Es divisible");
        } else{
            System.out.println("No es divisible");
        }
    }
}