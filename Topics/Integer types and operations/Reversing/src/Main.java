import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        Integer tra = scanner.nextInt();
        Integer mod1 = tra % 10;
        Integer tr1 = tra / 10;
        Integer mod2 = tr1 % 10;
        Integer tr2 = tr1 / 10;
        Integer mod3 = tr2 % 10;
        System.out.println(mod1 * 100 + mod2 * 10 + mod3 *1 );
    }
}