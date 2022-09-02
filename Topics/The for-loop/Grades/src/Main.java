import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        Integer num = scanner.nextInt();
        Integer d = 0, c = 0, b = 0, a = 0;
        for (Integer i = 0; i < num; i++) {
            String grades = scanner.next();
            if (grades.equals("B")) {
                b++;
            } else if (grades.equals("C")) {
                c++;
            } else if (grades.equals("D")) {
                d++;
            } else if (grades.equals("A")) {
                a++;
            }
        }
        System.out.print(d+" ");
        System.out.print(c+" ");
        System.out.print(b+" ");
        System.out.print(a+" ");


    }
}