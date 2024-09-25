public class Interfaces {
    public static void main(String args[]) {

        // King k = new King();
        // k.moves();

        Bear b = new Bear();
        b.walk();
        b.eats();
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