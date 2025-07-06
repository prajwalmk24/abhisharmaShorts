package testKnowledge;

public class test {

//    Scenario 1: A Functional Interface extends another interface with an abstract method.
//    In the below example, Is B still a valid functional interface?
    interface A {
        void methodA();
    }
    @FunctionalInterface
    interface B extends A {
// No new abstract method declared here
    }
//    Answer: Yes, B is valid. It inherits abstract method from A




//    Scenario 2: Can a Functional Interface have a
//    default method that has the same name as its abstract method, but with a different parameter list?
    @FunctionalInterface
    interface Aa {
        void test(String s); // abstract method
        default void test() { // default method, overload
            System.out.println("Default");
        }

        default void method(){
            System.out.println("llll");
        }

    }


    /*
//    Scenario 3: What happens if a Functional Interface (C) extends two interfaces (A and B) that each have different abstract methods? Is C is a valid interface?
    interface A1 {
        void methodA();
    }
    interface B1 {
        void methodB();
    }
    @FunctionalInterface
    interface C extends A1, B1 { // No new methods
        //
    }
*/


    public static void main(String[] args) {
        Aa test2= new Aa() {


            @Override
            public void test(String s) {

            }

            @Override
            public void test() {
                Aa.super.test();
            }
        };
    }
}
