package Opgave_4;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    public static Integer max(ArrayList<Integer> list){
        if (list.size() == 0){
            return null;

        }else {
            return java.util.Collections.max(list);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Input a sequense of int you want to put in the array ");
        while(true) {
            int i = sc.nextInt();
            if (i == 0) {
                break;
            } else list.add(i);

        }
        System.out.println(max(list));

    }
}
