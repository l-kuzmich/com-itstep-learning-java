package com.aqa.framework.example.page.block_interface.language_element;

import com.aqa.framework.example.page.element.login.language_element.TitleLanguageElement;

public interface HasTitleLanguageElement {
    TitleLanguageElement getTitleLanguageElement();

    default void showTitleLanguageElementSelector(){
        System.out.println(getTitleLanguageElement().elementSelector);
    }
}
