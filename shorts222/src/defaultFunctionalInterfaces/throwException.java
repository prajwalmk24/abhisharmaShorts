package defaultFunctionalInterfaces;


import java.io.IOException;

@FunctionalInterface
interface Operation{
        int Op(int a, int b) throws IOException;

        }

public class throwException {
    public static void main(String[] args) {
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


    }
}
