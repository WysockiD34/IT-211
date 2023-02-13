import java.util.Scanner;


class GPAtoPercent {
    public static void main(String[] args) {
    String line;
    System.out.println("Enter the GPA you wish to convert to a percentage range");
    Scanner inputScanner = new java.util.Scanner(System.in);
    line = inputScanner.nextLine();
    inputScanner.close();
    switch(line) {
        case "4.0":
        System.out.println("100% - 95%");
        break;

        case "3.9":
        System.out.println("95% - 94%");
        break;

        case "3.8":
        System.out.println("94% - 93%");
        break;

        case "3.7":
        System.out.println("93% - 92%");
        break;

        case "3.6":
        System.out.println("92% - 91%");
        break;

        case "3.5":
        System.out.println("91% - 90%");
        break;

        case "3.4":
        System.out.println("90% - 89%");
        break;

        case "3.3":
        System.out.println("89% - 88%");
        break;

        case "3.2":
        System.out.println("88% - 87%");
        break;

        case "3.1":
        System.out.println("87% - 86%");
        break;

        case "3.0":
        System.out.println("86% - 85%");
        break;

        case "2.9":
        System.out.println("85% - 84%");
        break;

        case "2.8":
        System.out.println("84% - 83%");
        break;

        case "2.7":
        System.out.println("83% - 82%");
        break;

        case "2.6":
        System.out.println("82% - 81%");
        break;

        case "2.5":
        System.out.println("81% - 80%");
        break;

        case "2.4":
        System.out.println("80% - 79%");
        break;

        case "2.3":
        System.out.println("79% - 78%");
        break;

        case "2.2":
        System.out.println("78% - 77%");
        break;

        case "2.1":
        System.out.println("77% - 76%");
        break;

        case "2.0":
        System.out.println("76% - 75%");
        break;

        case "1.9":
        System.out.println("75% - 74%");
        break;

        case "1.8":
        System.out.println("74% - 73%");
        break;

        case "1.7":
        System.out.println("73% - 72%");
        break;

        case "1.6":
        System.out.println("72% - 71%");
        break;

        case "1.5":
        System.out.println("71% - 70%");
        break;

        case "1.4":
        System.out.println("70% - 69%");
        break;

        case "1.3":
        System.out.println("69% - 68%");
        break;

        case "1.2":
        System.out.println("68% - 67%");
        break;

        case "1.1":
        System.out.println("67% - 66%");
        break;

        case "1.0":
        System.out.println("66% - 65%");
        break;

        case "0.0":
        System.out.println("65% - 0%");
        break;

        default:
        System.out.println("gpa was not entered");
        break;

    }
    }    
}
