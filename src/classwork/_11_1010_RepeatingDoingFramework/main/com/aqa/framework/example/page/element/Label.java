package com.aqa.framework.example.page.element;

import com.aqa.framework.example.annotation.Element;

@Element(elementName = "Label root Element")
public class Label extends BaseElement {

    public Label (String elementSelector) {
        super.elementSelector = elementSelector;
    }

}
