package overriding;

public class B extends A{
    @Override
    void doSomething() {
//        super.doSomething();
        System.out.println("B");
    }
}