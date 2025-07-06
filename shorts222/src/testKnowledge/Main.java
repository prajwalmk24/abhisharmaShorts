package testKnowledge;

abstract class Vehicle {
    abstract void speed();
}
interface Machine {
    default void speed() {
        System.out.println("Machine speed");
    }
}
class Car implements Machine {
    public void speed() {
        System.out.println("Car speed");

    }

    public void callMachineSpeed() {
        Machine.super.speed(); // ✅ Correct way to call default method
    }
}
public class Main {
    public static void main(String[] args) {
        Car cc=new Car();
                cc.speed();
                cc.callMachineSpeed();
    }
}
//1. Car speed
//2. Machine speed
