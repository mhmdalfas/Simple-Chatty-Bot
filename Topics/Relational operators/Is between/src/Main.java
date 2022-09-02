import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        Integer num1 = scanner.nextInt();
        Integer num2 = scanner.nextInt();
        Integer num3 = scanner.nextInt();

        if(((num1>=num2)&&(num1<=num3))||((num1>=num3)&&(num1<=num2)))
            System.out.println(true);
        else
            System.out.println(false);


    }
}