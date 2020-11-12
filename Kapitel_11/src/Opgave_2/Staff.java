package Opgave_2;

public class Staff extends Employee{

    private String title;


    @Override
    public String toString(){

        String toPrint = getClass() + " " + super.name;
        return toPrint;
    }

}
