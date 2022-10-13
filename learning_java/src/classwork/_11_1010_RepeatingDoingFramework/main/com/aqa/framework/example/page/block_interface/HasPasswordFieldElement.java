package com.aqa.framework.example.page.block_interface;

import com.aqa.framework.example.page.element.login.PasswordFieldElement;

public interface HasPasswordFieldElement {
    PasswordFieldElement getPasswordFieldElement();
    default void showPasswordFieldElementSelector(){
        System.out.println(getPasswordFieldElement().elementSelector);
    }
}
