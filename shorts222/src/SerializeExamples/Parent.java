package SerializeExamples;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public abstract class Parent {

    protected  char gender;

    public Parent(){}
    public Parent(char gender){
        this.gender=gender;
    }


   }
