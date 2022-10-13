package classwork._11_1010_RepeatingDoingFramework.main.com.aqa.framework.example.page.element.login;

import classwork._11_1010_RepeatingDoingFramework.main.com.aqa.framework.example.annotation.Element;
import classwork._11_1010_RepeatingDoingFramework.main.com.aqa.framework.example.page.element.Button;

@Element(elementName = "Login button Element")
public class LoginButtonElement extends Button {

    public LoginButtonElement(String elementSelector) {
        super(elementSelector);
    }

}
