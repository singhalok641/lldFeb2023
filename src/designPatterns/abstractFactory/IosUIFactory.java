package designPatterns.abstractFactory;

import designPatterns.abstractFactory.components.Buttons.Button;
import designPatterns.abstractFactory.components.Buttons.IosButton;
import designPatterns.abstractFactory.components.Dropdown.Dropdown;
import designPatterns.abstractFactory.components.Dropdown.IosDropdown;
import designPatterns.abstractFactory.components.Menu.IosMenu;
import designPatterns.abstractFactory.components.Menu.Menu;

public class IosUIFactory implements UIFactory{
    @Override
    public IosButton createButton() {
        return new IosButton();
    }

    @Override
    public IosMenu createMenu() {
        return null;
    }

    @Override
    public IosDropdown createDropdown() {
        return null;
    }
}
