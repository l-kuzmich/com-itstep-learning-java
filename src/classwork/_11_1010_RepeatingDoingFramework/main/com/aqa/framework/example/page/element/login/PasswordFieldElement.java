package classwork._11_1010_RepeatingDoingFramework.main.com.aqa.framework.example.page.element.login;

import classwork._11_1010_RepeatingDoingFramework.main.com.aqa.framework.example.annotation.Element;
import classwork._11_1010_RepeatingDoingFramework.main.com.aqa.framework.example.page.element.Input;

@Element(elementName = "Password field Element")
public class PasswordFieldElement extends Input {
    public PasswordFieldElement(String elementSelector) {
        super(elementSelector);
    }
}
