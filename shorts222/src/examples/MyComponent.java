package examples;


class Super {
    Super() {
        print();
    }
    void print() {
        System.out.println("Super Constructor");
    }
}
class Sub extends Super {
    int x = 10;
    void print() {
        System.out.println("Sub: x="+x);
    }
}
public class MyComponent {
    public static void main(String[] args) {
        new Sub();

      Sub  s1=new Sub();
        s1.print();
        System.out.println();
    }
}
//A. Super constructor
//B. Sub: x = 0
