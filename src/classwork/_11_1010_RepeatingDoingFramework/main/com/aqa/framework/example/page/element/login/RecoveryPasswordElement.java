package classwork._11_1010_RepeatingDoingFramework.main.com.aqa.framework.example.page.element.login;

import classwork._11_1010_RepeatingDoingFramework.main.com.aqa.framework.example.annotation.Element;
import classwork._11_1010_RepeatingDoingFramework.main.com.aqa.framework.example.page.element.Link;

@Element(elementName = "Recovery password Element")
public class RecoveryPasswordElement extends Link {

    public RecoveryPasswordElement(String elementSelector) {
        super(elementSelector);
    }
}
