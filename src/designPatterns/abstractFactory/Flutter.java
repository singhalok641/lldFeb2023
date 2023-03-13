package designPatterns.abstractFactory;

public class Flutter {
    public void setTheme(){

    }

    public void setRefreshRate(){

    }

    public UIFactory createUIFactory(SupportedPlatforms platform){
        if(platform.equals(SupportedPlatforms.ANDROID)){
            return new AndroidUIFactory();
        }
        else if(platform.equals(SupportedPlatforms.IOS)){
            return new IosUIFactory();
        }

        return null;
    }
}
