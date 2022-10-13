package com.aqa.framework.example.page.element.login;

import com.aqa.framework.example.annotation.Element;
import com.aqa.framework.example.page.element.Button;

@Element(elementName = "Login button Element")
public class LoginButtonElement extends Button {

    public LoginButtonElement(String elementSelector) {
        super(elementSelector);
    }

}
