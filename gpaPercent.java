import java.util.Scanner;

class gpaPercent {
    public static void main(String[] args) {
        Double input;

        System.out.println("Enter a grade percentage");
        Scanner inputScanner = new java.util.Scanner(System.in);
        input = inputScanner.nextDouble();
        inputScanner.close();
        

        if (input >= 95){
            System.out.println(4.0);
        } else if (95 <= input && input >= 94) {
            System.out.println(3.9);
        } else if (94 <= input && input >= 93) {
            System.out.println(3.8);
        } else if (93 <= input && input >= 92) {
            System.out.println(3.7);
        } else if (92 <= input && input >= 91) {
            System.out.println(3.6);
        } else if (91 <= input && input >= 90) {
            System.out.println(3.5);
        } else if (90 <= input && input >= 89) {
            System.out.println(3.4);
        } else if (89 <= input && input >= 88) {
            System.out.println(3.3);
        } else if (88 <= input && input >= 87) {
            System.out.println(3.2);
        } else if (87 <= input && input >= 86) {
            System.out.println(3.1);
        } else if (86 <= input && input >= 85) {
            System.out.println(3.0);
        } else if (85 <= input && input >= 84) {
            System.out.println(2.9);
        } else if (84 <= input && input >= 83) {
            System.out.println(2.8);
        } else if (83 <= input && input >= 82) {
            System.out.println(2.7);
        } else if (82 <= input && input >= 81) {
            System.out.println(2.6);
        } else if (81 <= input && input >= 80) {
            System.out.println(2.5);
        } else if (80 <= input && input >= 79) {
            System.out.println(2.4);
        } else if (79 <= input && input >= 78) {
            System.out.println(2.3);
        } else if (78 <= input && input >= 77) {
            System.out.println(2.2);
        } else if (77 <= input && input >= 76) {
            System.out.println(2.1);
        } else if (76 <= input && input >= 75) {
            System.out.println(2.0);
        } else if (75 <= input && input >= 74) {
            System.out.println(1.9);
        } else if (74 <= input && input >= 73) {
            System.out.println(1.8);
        } else if (73 <= input && input >= 72) {
            System.out.println(1.7);
        } else if (72 <= input && input >= 71) {
            System.out.println(1.6);
        } else if (71 <= input && input >= 70) {
            System.out.println(1.5);
        } else if (70 <= input && input >= 69) {
            System.out.println(1.4);
        } else if (69 <= input && input >= 68) {
            System.out.println(1.3);
        } else if (68 <= input && input >= 67) {
            System.out.println(1.2);
        } else if (67 <= input && input >= 66) {
            System.out.println(1.1);
        } else if (66 <= input && input >= 65) {
            System.out.println(1.0);
        } else {
            System.out.println(0.0);
        } 


    }

}
