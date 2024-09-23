public class OOPS {

    public static void main(String args[]) {

        // while creating object write class name followed by objectname =new keyword
        // again classname()
        // Pen p1 = new Pen();
        // p1.setColor("Yellow");
        // System.out.println(p1.color);

        // p1.setTip(10);
        // System.out.println(p1.tip);

        // bank account
        BankAccount myAcc = new BankAccount("Prathmesh kamble");
        // myAcc.setName("Prathmesh");
        // System.out.println("myAcc.name " + myAcc.name);
        // myAcc.setPassword("Prathmesh123");
        // System.out.println("Paasword is: " + myAcc.getPassword());
        System.out.println(myAcc.name);

    }
}

// creating a classs
// class Pen {
// // propetrties/attributes
// String color;
// int tip;

// // function setColor
// void setColor(String newColor) {
// color = newColor;
// };

// // function setTip
// void setTip(int newTip) {
// tip = newTip;
// }
// }

// acces modifiers
class BankAccount {
    String name;
    // private String password;

    // String getPassword() {
    // return this.password;
    // }

    // void setName(String newName) {
    // name = newName;
    // }

    // void setPassword(String newPass) {
    // password = newPass;
    // }

    // createing constructors
    BankAccount(String name) {
        this.name = name;
    }

}