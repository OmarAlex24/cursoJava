package polimorfismo;

public class Gato extends Animal{
    @Override
    void hacerSonido() {
        System.out.println("El gato hace miau miau");
    }
}
