package designPatterns.abstractFactory.components.Buttons;

public class AndroidButton implements Button{
    @Override
    public void changeSize() {
        System.out.println("Android button size changed");
    }
}
