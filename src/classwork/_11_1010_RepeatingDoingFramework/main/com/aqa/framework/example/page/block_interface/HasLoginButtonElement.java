package classwork._11_1010_RepeatingDoingFramework.main.com.aqa.framework.example.page.block_interface;

import classwork._11_1010_RepeatingDoingFramework.main.com.aqa.framework.example.page.element.login.LoginButtonElement;

public interface HasLoginButtonElement {
    LoginButtonElement getLoginButtonElement();

    default void showLoginButtonElementSelector(){
        System.out.println(getLoginButtonElement().elementSelector);
    }
}
