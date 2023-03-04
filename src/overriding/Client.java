package overriding;

public class Client {
    public static void main(String[] args) {
        B b = new B();
        b.doSomething();

//        A a = new A();
//        a.doSomething();

//        A a = new B();
//        a.doSomething();
    }
}
