package designPatterns.abstractFactory;

import designPatterns.abstractFactory.components.Buttons.AndroidButton;
import designPatterns.abstractFactory.components.Dropdown.AndroidDropdown;
import designPatterns.abstractFactory.components.Menu.AndroidMenu;

public class AndroidUIFactory implements UIFactory{

    @Override
    public AndroidButton createButton() {
        return new AndroidButton();
    }

    @Override
    public AndroidMenu createMenu() {
        return null;
    }

    @Override
    public AndroidDropdown createDropdown() {
        return null;
    }
}
