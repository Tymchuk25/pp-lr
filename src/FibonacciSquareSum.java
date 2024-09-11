public class FibonacciSquareSum {

    public int[]fibonacci(int n){
     int[] fib = new int[n];
     fib[0] =1;
     if(n>1)
         fib[1]=1;
     for (int i=2;i<n;i++){
         fib[i]=fib[i-1]+  fib[i-2];
     }
     return fib;
    }

    public int SumSquare(int n){
        int[]fib = fibonacci(n);
        int sum=0;
       for (int i = 0;i<n;i++){
           sum += fib[i]*fib[i];
           System.out.println("Ітерація номер: " + i+"      " +"Сума: " + sum);
       }
        return sum;
    }
}
