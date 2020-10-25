public class Opgave1_12 {
    /*
(Average speed in kilometers) Assume a runner runs 24 miles in 1 hour, 40 minutes,
and 35 seconds. Write a program that displays the average speed in kilometers per
hour. (Note that 1 mile is 1.6 kilometers.)

   */
    public static void main(String[] args) {
        System.out.print("Løberen løber ");
        System.out.print((24/(1+(40/60)+(35/3600))*1.6));
        System.out.println(" Km/t");
    }
}
