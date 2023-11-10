package polimorfismo;

import presencial.Impresora;
public class cliente {
    public static void main(String[] args) {
        Animal animal;

        animal = new Perro();
        animal.hacerSonido();

        System.out.println("***************");

        animal = new Gato();
        animal.hacerSonido();
    }
}
