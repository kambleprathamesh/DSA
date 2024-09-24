// import java.util.*;

public class OOPS {

    public static void main(String args[]) {

        Pen p1 = new Pen();
        p1.setColor("Green");
        System.out.println(p1.getColor());

        p1.setTip(5);
        System.out.println(p1.getTip());

        p1.setColor("Blue");
        System.out.println(p1.getColor());

    }

}

class Pen {
    private String Color;
    private int tip;

    void setColor(String color) {
        this.Color = color;
    }

    void setTip(int tip) {
        this.tip = tip;
    }

    String getColor() {
        return this.Color;
    }

    int getTip() {
        return this.tip;
    }
}
