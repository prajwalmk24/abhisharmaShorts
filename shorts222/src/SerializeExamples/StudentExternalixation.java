package SerializeExamples;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class StudentExternalixation implements Externalizable {
    int id;
    String name;

    public StudentExternalixation(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public StudentExternalixation() {
    }

    @Override
    public String toString() {
        return "StudentExternalixation{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name);

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this.name= String.valueOf(in.readInt());

    }
}
