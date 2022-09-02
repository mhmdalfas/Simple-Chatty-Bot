import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        Integer num1 = scanner.nextInt();

        // You can use scanner.nextBoolean() to read a boolean value
        Boolean week = scanner.nextBoolean();
        if (num1 >= 10 && num1 <= 20 && week == false || num1 >= 15 && num1 <= 25 && week == true) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}