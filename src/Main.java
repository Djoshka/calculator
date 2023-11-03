import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите 2 числа");
        int x = scan.nextInt();
        int y = scan.nextInt();
        int sum = new Sum(x,y).calculate();




    }
}