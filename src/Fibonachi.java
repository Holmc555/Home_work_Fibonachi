public class Fibonachi {
    public static void main(String[] args) {
        System.out.println("Результат с итерацией: " + FibonachiIteration.finab(6));
        System.out.println("Результат с рекурсией: " + FibonachiRecursion.fibrec(6));
        System.out.println("Результат с динам. методом: " + FibonachiDP.fib(6));
    }

}