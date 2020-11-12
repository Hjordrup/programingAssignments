package Opgave_10;

public class BookTest {


    public static void main(String[] args) {
        Queue q1 = new Queue();
        for (int i = 1; i <= 20; i++) {
            q1.enqueue(i);

        }
        for (int i = 0; i <=19; i++) {
            System.out.println(q1.dequeue());
        }










    }





}
