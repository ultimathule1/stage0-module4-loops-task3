package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        if (second < first) {
            int tmp = first;
            first = second;
            second = tmp;
        }

        int gcd = 1;
        for (int i = 2; i <= first; i++) {
            if ((first % i == 0) && (second % i == 0)) {
                gcd = i;
            }
        }
        if((first == 0) || (second == 0)) {
            System.out.println(first);
        }
        System.out.println(gcd);
    }
}
