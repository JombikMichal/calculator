import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        do{
            System.out.println("Write number, then type of operation (+,-,*,/) i.e.: 6/2 or 3+3");

            final double left;
            final char operator;
            final double right;

            left = scanner.nextDouble();
            operator = scanner.next().charAt(0);
            right = scanner.nextDouble();

            Operands operands = new Operands(left,right);

            System.out.println(operands.getLeft() + " "+ operands.getRight());

        } while (true);

    }
}
