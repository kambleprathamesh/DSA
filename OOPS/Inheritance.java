public class Inheritance {
    public static void main(String args[]) {

        Fish f1 = new Fish();
        f1.Eats();

    }
}

class Animal {
    String color;
    String legs;

    void Eats() {
        System.out.println("eats");
    }
}

class Fish extends Animal {
    int fins;
    String legs;

    void swims() {
        System.out.println("Swims");
    }
}
