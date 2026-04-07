package cleancode.dry;

public class MathOperations {
    public static int add(int... args) {
        int sum = 0;
        for (int num : args) {
            sum += num;
        }
        return sum;
    }
}
