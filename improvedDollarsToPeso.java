import java.util.Scanner;

public class improvedDollarsToPeso {
    public static void main(String[] args) {
    double dollars;
    double pesos;

    System.out.println("Type out the amount of dollars that you want to convert to pesos and then press ENTER:");

    Scanner inputScanner = new java.util.Scanner(System.in);

    dollars = inputScanner.nextDouble();

    pesos = 18.81 * dollars; // converts dollars to pesos

    System.out.print(dollars + " dollars is equal to " + pesos + " pesos." );

    inputScanner.close();

    }
}
