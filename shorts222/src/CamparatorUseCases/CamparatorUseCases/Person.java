package CamparatorUseCases.CamparatorUseCases;

public class Person {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Constructor
    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Display method
    public void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}
