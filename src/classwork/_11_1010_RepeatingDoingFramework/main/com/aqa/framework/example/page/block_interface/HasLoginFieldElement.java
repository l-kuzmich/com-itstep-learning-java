package com.aqa.framework.example.page.block_interface;

import com.aqa.framework.example.page.element.login.LoginFieldElement;

public interface HasLoginFieldElement {
    LoginFieldElement getLoginFieldElement();
    default void showLoginFieldElementSelector(){
        System.out.println(getLoginFieldElement().elementSelector);
    }
}
