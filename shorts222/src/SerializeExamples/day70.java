package SerializeExamples;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class day70 {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Prajwal");

        try {
            FileOutputStream fileOut = new FileOutputStream("student.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            out.writeObject(s1);
            out.close();
            fileOut.close();

            System.out.println("Object has been serialized");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
