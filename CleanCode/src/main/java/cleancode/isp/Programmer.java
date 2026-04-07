package cleancode.isp;

class Programmer implements Worker {
    @Override
    public void work() {
        System.out.println("Программист пишет код");
    }
}
