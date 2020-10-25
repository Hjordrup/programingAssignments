package Opgave_9_7;

public class MainTest {

    public static void main(String[] args) {

        Account Anders = new Account(1122, 20000);
        Anders.setAnnualInterestRate(4.5);
        System.out.println(Anders.getBalance());
        System.out.println(Anders.getAnnualInterestRate());
        System.out.println(Anders.getId());

        System.out.println("************************");
        Anders.withdraw(2500);
        System.out.println(Anders.getBalance());

        System.out.println("************************");
        Anders.deposit(3000);


        System.out.println("******************************");
        System.out.println(Anders.getBalance());
        System.out.println(Anders.getMonthlyInterest());
        System.out.println(Anders.getDateCreated());





    }




}
