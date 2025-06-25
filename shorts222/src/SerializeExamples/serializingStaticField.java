package SerializeExamples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class serializingStaticField {

    // serializing the static field is not possible
/*
    public static void main(String[] args) {
        // make password field as static
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

        Student s2 = new Student(102, "----------");

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
