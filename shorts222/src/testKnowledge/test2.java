package testKnowledge;

class Parent {
    {
        draw(5);
    }
    void draw(int a) {
        System.out.println("parent" + a);
    }
}
class Child extends Parent {
    void draw(int a) {
        System.out.println("child " + a);
//        super.draw(10); // 👈 this calls Parent.draw()
    }

    void draw2(int a) {
        System.out.println("child " + a);
        super.draw(10);
    }

}
public class test2 {
    public static void main(String[] args) {
        Parent p = new Child();
        p.draw(10);
//        ((Child) p).draw2(10);
    }
}
//a. parent 5, child 10
//b. child 5, child 10
