public class HelloWorld {
    static int age = 30;

    public static void main(String[] args) {
        System.out.println("Это Алсу!");
        System.out.println(age + 2);
        int sum = sum(20, 5);
        System.out.println(sum);
        System.out.println(divide(14,3));
    }

    public static int sum(int x, int y) {
        return x + y;
    }

    public static double divide(int x, int y) {
        return (double) x / y;
    }
}
