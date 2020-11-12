package Opgave_2;

public class Student extends Person{
    private final String classStatus = "JUNIOR";


    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String toString(){

        String toPrint = getClass() + " " + super.name;
        return toPrint;
    }
}
