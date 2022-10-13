package com.aqa.framework.example.page.element;

import com.aqa.framework.example.annotation.Element;

@Element(elementName = "Button root Element")
public class Button extends BaseElement {

    public Button (String elementSelector) {
        super.elementSelector = elementSelector;
    }

}
