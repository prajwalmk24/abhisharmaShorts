package SerializeExamples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.List;

public class enumSerialExample {
// Enums are by default serialize in nature
    public static void main(String[] args) {
        Student students = new Student(1,"rajesh",enumSerial.LION);

        // ✅ Serialize the list
        try (
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("stu.ser"))) {
            oos.writeObject(students);
            System.out.println("List serialized."+students);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // ✅ Deserialize the list
        try (
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("stu.ser"))) {
            Student deserializedStudents = (Student) ois.readObject();
            System.out.println("List deserialized:"+deserializedStudents);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}
