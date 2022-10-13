package classwork._11_1010_RepeatingDoingFramework.main.com.aqa.framework.example.page.block_interface;

import classwork._11_1010_RepeatingDoingFramework.main.com.aqa.framework.example.page.element.login.LoginFieldElement;

public interface HasLoginFieldElement {
    LoginFieldElement getLoginFieldElement();
    default void showLoginFieldElementSelector(){
        System.out.println(getLoginFieldElement().elementSelector);
    }
}
