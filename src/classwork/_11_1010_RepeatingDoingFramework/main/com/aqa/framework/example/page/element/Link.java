package classwork._11_1010_RepeatingDoingFramework.main.com.aqa.framework.example.page.element;

import classwork._11_1010_RepeatingDoingFramework.main.com.aqa.framework.example.annotation.Element;

@Element(elementName = "Link root Element")
public class Link extends BaseElement {

    public Link (String elementSelector) {
        super.elementSelector = elementSelector;
    }

}
