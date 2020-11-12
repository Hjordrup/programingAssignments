package Opgave_2;

public class Faculty extends Employee{

    private String officeHours;
    private String rank;


    @Override
    public String toString(){

        String toPrint = getClass() + " " + super.name;
        return toPrint;
    }

}
