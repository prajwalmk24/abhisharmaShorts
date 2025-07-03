package SerializeExamples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class externalnization {
    public static void main(String[] args) {

        StudentExternalixation s1 = new StudentExternalixation(101, "Prajwal");


        //serialize
        try {
            FileOutputStream fileOut = new FileOutputStream("studentexternal.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            out.writeObject(s1);


            System.out.println("Object has been serialized" + s1);

            out.close();
            fileOut.close();

        } catch (Exception e) {
            e.printStackTrace();
        }


        //deserialize
        try {
            FileInputStream fileOut = new FileInputStream("studentexternal.ser");
            ObjectInputStream out = new ObjectInputStream(fileOut);

            StudentExternalixation stfObj = (StudentExternalixation) out.readObject();


            System.out.println("Object has been de-serialized" + stfObj);

        } catch (Exception e) {
            e.printStackTrace();
        }

//        output
//        explain : Here we are not store id to file

//        Object has been serializedStudentExternalixation{id=101, name='Prajwal'}
//        Object has been de-serializedStudentExternalixation{id=0, name='Prajwal'}

    }

}

