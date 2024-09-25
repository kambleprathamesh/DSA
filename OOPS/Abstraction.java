public class Abstraction {
    public static void main(String args[]) {
        Horse h = new Horse();
        h.eat();
        System.out.println(h.setColor("pink"));
        h.walk();
    }
}

abstract class Animal {
    String color = "Brown";

    public abstract void eat();

    Animal() {
        System.out.println("Animal Constructor called...");
    }

    void walk() {
        System.out.println("Animal  walk function called...");

    }
}

class Horse extends Animal {

    Horse() {
        System.out.println("Horse Constructor called...");
    }

    String setColor(String color) {
        return this.color = color;
    }

    public void eat() {
        System.out.println("Horse  eat function called...");

    }

}

class Mustang {
    Mustang() {
        System.out.println("Mustang Constructor called...");
    }

    void eat() {
        System.out.println("Mustang  eat function called...");

    }
}