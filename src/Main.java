import java.util.Scanner;
//23.	Визначити суму квадратів N перших чисел Фібоначчі

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть число N:");
        int N = scanner.nextInt();
        FibonacciSquareSum fibonacciSquareSum = new FibonacciSquareSum();
        int result = fibonacciSquareSum.SumSquare(N);
        System.out.println("Сума квадратів перших " + N + " чисел Фібоначчі: " + result);

        FibonacciSquareSum.Test();
    }
}
