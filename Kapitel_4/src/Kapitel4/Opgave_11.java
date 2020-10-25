package Kapitel4;
import java.util.Scanner;

public class Opgave_11 {
    public static void main(String[] args) {


        System.out.println("input the binary digtis you want convertet to decimal ");
        Scanner sc = new Scanner(System.in);
        String binary = sc.nextLine();

        int outPut = decimalConvertet(binary);
        System.out.println(outPut);
    }


    static int decimalConvertet (String binary){
        String binaryNum = binary;
        int deciaml = Integer.parseInt(binaryNum,2);
        return deciaml;



    }





}
