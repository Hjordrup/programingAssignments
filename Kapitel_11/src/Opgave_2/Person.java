package Opgave_2;

public class Person {

protected String name;
protected String address;
protected int phoneNumber;
protected String eMail;


    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){

    String toPrint = getClass() + " " + name;
    return toPrint;
}





}
