package polimorfismo;

public class Perro extends Animal {
    @Override
    void hacerSonido() {
        System.out.println("El perro hace guau guau");
    }
}
