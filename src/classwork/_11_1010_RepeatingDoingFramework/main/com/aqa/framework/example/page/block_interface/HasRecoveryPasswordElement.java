package com.aqa.framework.example.page.block_interface;

import com.aqa.framework.example.page.element.login.RecoveryPasswordElement;

public interface HasRecoveryPasswordElement {
    RecoveryPasswordElement getRecoveryPasswordElement();
    default void showRecoveryPasswordElementSelector(){
        System.out.println(getRecoveryPasswordElement().elementSelector);
    }
}
