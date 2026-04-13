package cleancode.lsp;

abstract class Bird {
    String name;
    Bird(String name){
        this.name = name;
    }
    void eat() {
        System.out.println(name + " ест");
    }
}
