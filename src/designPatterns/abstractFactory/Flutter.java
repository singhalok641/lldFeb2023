package designPatterns.abstractFactory;

public class Flutter {
    private SupportedPlatforms platform;

    public Flutter(SupportedPlatforms platform){
        this.platform = platform;
    }

    public void setTheme(){

    }

    public void setRefreshRate(){

    }

    public UIFactory createUIFactory(){
        UiFactoryFactory.getUiFactoryForPlatform(platform);
        return null;
    }
}
