package Opgave_6;

import java.util.ArrayList;
import java.util.Date;

public class ArrayListAssigment {


    public static void main(String[] args) {

    // Create an ArrayList
        ArrayList<Object> a1 = new ArrayList<>();

        a1.add(new Circle());
        a1.add(new Loan());
        a1.add(new Date());


        for (int i = 0; i < a1.size(); i++) {
            System.out.println(a1.get(i).toString());
        }









    }





}
