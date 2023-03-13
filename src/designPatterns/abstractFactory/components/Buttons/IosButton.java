package designPatterns.abstractFactory.components.Buttons;

public class IosButton implements Button{

    @Override
    public void changeSize() {
        System.out.println("IOS Button size changed");
    }
}
