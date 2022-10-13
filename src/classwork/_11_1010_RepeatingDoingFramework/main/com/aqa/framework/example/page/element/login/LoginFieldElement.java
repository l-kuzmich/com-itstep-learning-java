package classwork._11_1010_RepeatingDoingFramework.main.com.aqa.framework.example.page.element.login;

import classwork._11_1010_RepeatingDoingFramework.main.com.aqa.framework.example.annotation.Element;
import classwork._11_1010_RepeatingDoingFramework.main.com.aqa.framework.example.page.element.Input;

@Element(elementName = "Login field Element")
public class LoginFieldElement extends Input {
    public LoginFieldElement(String elementSelector) {
        super(elementSelector);
    }
}
