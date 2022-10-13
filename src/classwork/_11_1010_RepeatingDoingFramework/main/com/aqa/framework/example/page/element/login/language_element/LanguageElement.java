package classwork._11_1010_RepeatingDoingFramework.main.com.aqa.framework.example.page.element.login.language_element;

import classwork._11_1010_RepeatingDoingFramework.main.com.aqa.framework.example.annotation.Element;
import classwork._11_1010_RepeatingDoingFramework.main.com.aqa.framework.example.page.element.Link;

@Element(elementName = "Language Element")
public class LanguageElement extends Link {
    public LanguageElement(String elementSelector) {
        super(elementSelector);
    }
}
