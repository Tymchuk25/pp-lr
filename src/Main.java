import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть число N:3");
        int N = scanner.nextInt();
        FibonacciSquareSum fibonacciSquareSum = new FibonacciSquareSum();
        int result = fibonacciSquareSum.SumSquare(N);
        System.out.println("Сума квадратів перших " + N + " чисел Фібоначчі: " + result);
    }
}
