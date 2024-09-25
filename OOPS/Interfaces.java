public class Interfaces {
    public static void main(String args[]) {

        // King k = new King();
        // k.moves();
        // Bear b = new Bear();
        // b.walk();
        // b.eats();

        B b = new B();
        System.out.println(b.A);
    }
}

interface chessPlayer {

    // in interface the methods are public and abstract byDefault
    void moves();

}

class King implements chessPlayer {
    public void moves() {
        System.out.println("King is Moving");
    }
}

// multiple interface
interface herbivore {
    void walk();
}

interface carnivore {
    void eats();
}

class Bear implements herbivore, carnivore {
    public void walk() {
        System.out.println("Beaer is Moving");
    }

    public void eats() {
        System.out.println("Beaer is eating");

    }
}

class A {
    String A;

    A() {
        System.out.println("Printing A");
    }
}

class B extends A {

    B() {
        super.A = "prathmesh";
        System.out.println("Printing B");

    }

}