package classwork._11_1010_RepeatingDoingFramework.main.com.aqa.framework.example.page.block_interface.language_element;

import classwork._11_1010_RepeatingDoingFramework.main.com.aqa.framework.example.page.element.login.language_element.TitleLanguageElement;

public interface HasTitleLanguageElement {
    TitleLanguageElement getTitleLanguageElement();

    default void showTitleLanguageElementSelector(){
        System.out.println(getTitleLanguageElement().elementSelector);
    }
}
