package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        int sum = 0;
        if (firstBoarder > secondBoarder) {
            int tmp = secondBoarder;
            secondBoarder = firstBoarder;
            firstBoarder = tmp;
        }
        for(int i = firstBoarder + 1; i <= secondBoarder; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
