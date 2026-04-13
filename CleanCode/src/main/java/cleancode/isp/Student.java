package cleancode.isp;

public class Student implements Eatable {
    @Override
    public void eat() {
        System.out.println("Студент ест");
    }
}
