package com.aqa.framework.example.page.element;

import com.aqa.framework.example.annotation.Element;

@Element(elementName = "Input root Element")
public class Input extends BaseElement {

    public Input (String elementSelector) {
        super.elementSelector = elementSelector;
    }

}
