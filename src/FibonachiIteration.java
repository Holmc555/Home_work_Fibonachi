public class FibonachiIteration {

    static int finab(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0, b = 1, fib = 1;

        for (int i = 2; i <= n; i++){
            fib = a + b;
            a = b;
            b = fib;
        }
        return fib;
    }
}
