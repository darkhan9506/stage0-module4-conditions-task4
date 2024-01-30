package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int res1 = first > second ? first : second;
        int max = third > res1 ? third : res1;
        System.out.println(max);
    }
}
