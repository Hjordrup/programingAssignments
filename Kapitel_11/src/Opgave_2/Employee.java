package Opgave_2;

import java.util.Date;

public class Employee extends Person{

    private String office;
    private double salary;
    private Date dateHired = new Date();


    @Override
    public String toString(){

        String toPrint = getClass() + " " + super.name;
        return toPrint;
    }




}
