package com.aqa.framework.example.page.element.login;

import com.aqa.framework.example.annotation.Element;
import com.aqa.framework.example.page.element.Link;

@Element(elementName = "Recovery password Element")
public class RecoveryPasswordElement extends Link {

    public RecoveryPasswordElement(String elementSelector) {
        super(elementSelector);
    }
}
