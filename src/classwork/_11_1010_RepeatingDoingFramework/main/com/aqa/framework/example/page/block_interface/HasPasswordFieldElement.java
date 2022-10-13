package classwork._11_1010_RepeatingDoingFramework.main.com.aqa.framework.example.page.block_interface;

import classwork._11_1010_RepeatingDoingFramework.main.com.aqa.framework.example.page.element.login.PasswordFieldElement;

public interface HasPasswordFieldElement {
    PasswordFieldElement getPasswordFieldElement();
    default void showPasswordFieldElementSelector(){
        System.out.println(getPasswordFieldElement().elementSelector);
    }
}
