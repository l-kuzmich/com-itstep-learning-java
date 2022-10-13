package com.aqa.framework.example.page.element.login;

import com.aqa.framework.example.annotation.Element;
import com.aqa.framework.example.page.element.Input;

@Element(elementName = "Login field Element")
public class LoginFieldElement extends Input {
    public LoginFieldElement(String elementSelector) {
        super(elementSelector);
    }
}
