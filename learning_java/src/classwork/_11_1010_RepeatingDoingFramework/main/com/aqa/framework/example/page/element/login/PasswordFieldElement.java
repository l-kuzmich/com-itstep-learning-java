package com.aqa.framework.example.page.element.login;

import com.aqa.framework.example.annotation.Element;
import com.aqa.framework.example.page.element.Input;

@Element(elementName = "Password field Element")
public class PasswordFieldElement extends Input {
    public PasswordFieldElement(String elementSelector) {
        super(elementSelector);
    }
}
