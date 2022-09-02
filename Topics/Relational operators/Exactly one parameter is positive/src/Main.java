import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        Integer counter = 0;

        for (Integer i = 0; i < 3; i++) {
            Integer num1 = scanner.nextInt();
            if (num1 > 0) {
                counter++;
            }


        }
        if (counter == 1) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}