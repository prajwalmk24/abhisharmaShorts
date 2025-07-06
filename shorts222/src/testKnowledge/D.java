package testKnowledge;

interface A {
    default void print() {
        System.err.println("A");
    }
}
interface B {
    default void print() {
        System.err.println("B");
    }
}
class Combine implements A,B {
    @Override
    public void print() {

        A.super.print();

    }
}
public class D {
    public static void main(String[] args) {
        new Combine().print();
    }
}


//1. A
//2.B
//3. A,B
