package defaultFunctionalInterfaces;


import java.io.IOException;

@FunctionalInterface
interface Operation{
        int Op(int a, int b) throws IOException;

        }


@FunctionalInterface
interface Operation2{
    int Op(int a, int b);

}

public class throwException {
    public static void main(String[] args) {

        /*
        Operation operation = (q,w)->{
            if(q/w ==0)
                throw new IOException("My custom IO Exception");


            return q/w;
        };

            try {
                operation.Op(3,0);
            }
            catch (Exception e){
                    e.printStackTrace();
            }
*/

            Operation2 op2 =(a,b)-> {
                return a+b;
            };

        System.out.println("outptu "+op2.Op(2,23));


    }
}
