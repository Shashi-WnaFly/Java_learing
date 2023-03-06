
package com.Practice;
class Joker {
    public Joker() {
        System.out.println("I am a Joker without an arguments");
    }

    public Joker(int g, int e, int f) {
        System.out.println("Joker's number is " + (g + e + f));
    }
}

class Clown extends Joker {
    public Clown() {
        System.out.println("I am a Clown without an arguments");
    }

    public Clown(int c) {
        System.out.println("Clown's number is " + c);
    }
}

class Toy extends Clown {
    public Toy() {
        System.out.println("I am a Toy without arguments");
    }

    public Toy(int a, int d) {
        System.out.println("Your Toy number is " + (a + d));
    }
}

public class ConstructorIn {
    public static void main(String[] args) {
//        Toy go = new Toy();
        Clown co = new Clown(9);
//        go.Clown(7);
//        Joker jo = new Joker();
//        jo.Joker(12,34,1);
        // go.Clown();

    }
}
