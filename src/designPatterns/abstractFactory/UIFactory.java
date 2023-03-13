package designPatterns.abstractFactory;

import designPatterns.abstractFactory.components.Buttons.Button;
import designPatterns.abstractFactory.components.Dropdown.Dropdown;
import designPatterns.abstractFactory.components.Menu.Menu;

public interface UIFactory {
    public Button createButton();
    public Menu createMenu();
    public Dropdown createDropdown();
}
