package p2;

class Animals {
    void eat() {
        System.out.println("This animal eats food.");
    }
}
class Mammal extends Animals {
    void walk() {
        System.out.println("This mammal walks.");
    }
}
class Dogs extends Mammal {
    void bark() {
        System.out.println("The dog barks.");
    }
}
public class MultilevelInheritanceDemo{
    public static void main(String[] args) {
        Dogs o = new Dogs();

        o.eat();
        o.walk();
        o.bark();
    }
}
