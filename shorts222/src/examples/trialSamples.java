package examples;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface operation {
    public int add(int a,int b);
}

class i implements operation{

    @Override
    public int add(int a, int b) {
        return a+b;
    }
}

public class trialSamples {

    public static void main(String[] args) {

//        operation operationobj = (a, b) -> a+b;
//        int rr = operationobj.add(1, 2);

        operation iobj= new i(){};
        int ee = iobj.add(2, 3);

        System.out.println("ee"+ee);

    }
}
