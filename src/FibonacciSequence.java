public class FibonacciSequence {

    public static int fib(int n){
        if (n > 1) {
            return fib(n - 2) + fib(n-1);
        }// if statement
        else if (n == 1){
            return 1;
        }// else if
        else{
            return 0;
        }// else
    }// Fibonacci sequence function

}
