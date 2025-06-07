package CamparatorUseCases;

import CamparatorUseCases.CamparatorUseCases.Person;

public class MyComparator {
    MyComparator(){

    }

    public static int compareByName(Person o1, Person o2){
        return o1.getName().compareTo(o2.getName());
    }












}
