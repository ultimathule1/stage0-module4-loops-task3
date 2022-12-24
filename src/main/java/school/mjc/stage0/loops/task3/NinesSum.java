package school.mjc.stage0.loops.task3;

public class NinesSum {
    public static void calculateSum(int lengthOfLastNumber) {
        int n = 9;
        int sum = 0;
        for (int i = 0; i < lengthOfLastNumber; i++) {
            sum += n;
            n = n * 10 + 9;
        }
        System.out.println(sum);
    }
}
