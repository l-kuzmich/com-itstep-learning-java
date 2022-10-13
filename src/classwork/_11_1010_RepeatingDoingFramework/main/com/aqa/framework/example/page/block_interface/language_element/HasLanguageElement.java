package classwork._11_1010_RepeatingDoingFramework.main.com.aqa.framework.example.page.block_interface.language_element;

import classwork._11_1010_RepeatingDoingFramework.main.com.aqa.framework.example.page.element.login.language_element.LanguageElement;

public interface HasLanguageElement {

    LanguageElement getLanguageElement();
    default void showLanguageElementSelector(){
        System.out.println(getLanguageElement().elementSelector);
    }
}
