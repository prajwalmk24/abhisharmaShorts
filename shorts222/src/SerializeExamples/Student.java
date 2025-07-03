package SerializeExamples;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student extends Parent implements Serializable  {

    private static final long serialVersionUID = 1L;
//  To see the usecase of searialVersionId , comment the code write object from deserialize to avoid
//    java.io.InvalidClassException: SerializeExamples.Student; local class incompatible: stream classdesc serialVersionUID = 1, local class serialVersionUID = -6389804740329378697



    int id;

    transient String nam;
    // static String nam;
    enumSerial es;

    public Student(int i, String nam, enumSerial eS) {
        this.id=id;
        this.nam=nam;
        this.es=eS;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", nam='" + nam + '\'' +
                ", es=" + es +
                '}';
    }
//Uncomment to use it in serializable.java example
//    public Student(int id, String name) {
//        this.id=id;
//        this.nam=name;
//
//    }

//    public Student(int id, String name,char gender) {
//        super(gender);
//        this.id=id;
//        this.nam=name;
//
//    }


//    private void writeObject(ObjectOutputStream out) throws IOException {
//        out.defaultWriteObject();
//        out.writeChar(gender);
//    }
//    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
//        ois.defaultReadObject();
//        gender=ois.readChar();
//    }
//    @Override
//    public String toString() {
//        return "Student{" +
//                "id=" + id +
//                ", nam='" + nam + '\'' +
//                ", gender=" + gender +
//                '}';
//    }
}
