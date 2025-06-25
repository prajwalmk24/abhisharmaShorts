package SerializeExamples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class deserialize {

    /*
    public static void main(String[] args) {
        Student s1 = new Student(101, "Prajwal");

        //serialize
        try {
            FileOutputStream fileOut = new FileOutputStream("student.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            out.writeObject(s1);
            out.close();
            fileOut.close();

            System.out.println("Object has been serialized"+ s1);

        } catch (Exception e) {
            e.printStackTrace();
        }

        //deserialize
        try {
            FileInputStream fileOut = new FileInputStream("student.ser");
            ObjectInputStream out = new ObjectInputStream(fileOut);

            Student stfObj = (Student) out.readObject();


            System.out.println("Object has been de-serialized"+stfObj);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

*/



}


