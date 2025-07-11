package testKnowledge;

abstract class Vehicle {
    abstract void speed();
}

interface Machine {

    /*Interface cannot have constructors*/
//    Machine(){
//
//    }

    default void speed() {
        System.out.println("Machine speed");
    }
}

class Car implements Machine {
//    public void speed() {
//        System.out.println("Car speed");
//
//    }
//
//    public void callMachineSpeed() {
//        Machine.super.speed(); // ✅ Correct way to call default method
//    }
}

public class Main {
    public static void main(String[] args) {
        Machine cc = new Car();
        cc.speed();
//                cc.callMachineSpeed();

//        Machine cc=new Car();


        /*
Calls the Interfce
default void speed() {
  System.out.println("Machine speed");
    }


    !!!! But comment all the overide methods in Car class. Only then it will  work

//        Machine cc=new Car();
//        cc.speed();
 */


    }
}
//1. Car speed
//2. Machine speed
