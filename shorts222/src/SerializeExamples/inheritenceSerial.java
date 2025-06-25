package SerializeExamples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


/*Day 75*/
public class inheritenceSerial {

    // achieving serialization through inheritence
    public static void main(String[] args) {


        Student s1 = new Student(101, "Prajwal",'M');

        //serialize
        try {
            FileOutputStream fileOut = new FileOutputStream("student.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            out.writeObject(s1); //pls call it in student


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

            Student stfObj = (Student) out.readObject(); // pls see the two methods


            System.out.println("Object has been de-serialized"+stfObj);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
