public class FibonachiDP {

    static int fib (int n) {
        if (n <= 1){
            return n;
        }
        int [] fibTable = new int[n + 1];
        fibTable[0] = 0; //F(0)
        fibTable[1] = 1; //F(1)

        for (int i = 2; i <= n; i++){
            fibTable[i] = fibTable [i - 1] + fibTable [i-2];
        }
        return fibTable[n];
    }

}
