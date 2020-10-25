import java.util.Scanner;


public class Opgave_13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hvor meget vil du opspare? ");

        double Amount = input.nextDouble();

        double Rate = (1 + 0.003125);
        double Num1 =Amount*Rate;
        double Num2 =(Amount+Num1)*Rate;
        double Num3 =(Amount+Num2)*Rate;
        double Num4 =(Amount+Num3)*Rate;
        double Num5 =(Amount+Num4)*Rate;
        double Num6 =(Amount+Num5)*Rate;

        System.out.println("Efter den første mående har du opsparet" + Num1);
        System.out.println("Efter den anden mående har du opsparet" + Num2);
        System.out.println("Efter den trejde mående har du opsparet" + Num3);
        System.out.println("Efter den fjerde mående har du opsparet" + Num4);
        System.out.println("Efter den femte mående har du opsparet" + Num5);
        System.out.println("Efter den sjette mående har du opsparet" + Num6);




    }







}
