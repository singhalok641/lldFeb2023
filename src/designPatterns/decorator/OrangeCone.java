package designPatterns.decorator;

public class OrangeCone implements IceCreamConeConstituents {

    private IceCreamConeConstituents iceCreamConeConstituents;

    public OrangeCone(){

    }

    public OrangeCone(IceCreamConeConstituents iceCreamConeConstituents){
        this.iceCreamConeConstituents = iceCreamConeConstituents;
    }

    @Override
    public String getDescription() {
        if(iceCreamConeConstituents != null){
            return iceCreamConeConstituents.getDescription() + "Orange Cone";
        }
        return "Orange Cone";
    }

    @Override
    public int getCost() {
        if(iceCreamConeConstituents != null){
            return iceCreamConeConstituents.getCost() + 20;
        }
        return 20;
    }

    public void setVitaminCLevel(int newLevel) {}
}
