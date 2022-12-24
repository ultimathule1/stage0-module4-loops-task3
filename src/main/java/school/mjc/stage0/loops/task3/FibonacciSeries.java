package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public static void main(String[] args) {
        printFibonacci(10);
    }
    public static void printFibonacci(int lastFibonacci) {
        int prev = 0;
        int next = 1;
        int tmp;
        for (int i = 1; i < lastFibonacci; i++) {
            System.out.println(prev);
            tmp = prev + next;
            prev = next;
            next = tmp;
        }
        System.out.println(prev);
    }
}
