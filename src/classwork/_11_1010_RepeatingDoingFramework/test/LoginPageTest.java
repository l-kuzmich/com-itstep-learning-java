package classwork._11_1010_RepeatingDoingFramework.test;

import classwork._11_1010_RepeatingDoingFramework.main.com.aqa.framework.example.page.LoginPage;
import classwork._11_1010_RepeatingDoingFramework.main.com.aqa.framework.example.service.LoginPageService;

public class LoginPageTest {

    private LoginPageService loginPageService = new LoginPageService();

    public static void main(String[] args) {
        LoginPageTest test = new LoginPageTest();
        test.checkLoginButtonField();
        test.checkLoginField();
        test.checkPasswordField();
        test.checkRecoveryPasswordField();
        test.checkLanguageElement();
        test.checkTitleLanguageElement();

    }

    public void checkPasswordField(){
        loginPageService.getLoginPage().getLoginFormBlock().showPasswordFieldElementSelector();
    }

    public void checkLoginField(){
        loginPageService.getLoginPage().getLoginFormBlock().showLoginFieldElementSelector();
    }

    public void checkLoginButtonField(){
        loginPageService.getLoginPage().getLoginFormBlock().showLoginButtonElementSelector();
    }

    public void checkRecoveryPasswordField(){
        loginPageService.getLoginPage().getLoginFormBlock().showRecoveryPasswordElementSelector();
    }

    public void checkLanguageElement(){
        loginPageService.getLoginPage().getLanguageBlock().showLanguageElementSelector();
    }

    public void checkTitleLanguageElement(){
        loginPageService.getLoginPage().getLanguageBlock().showTitleLanguageElementSelector();
    }
}
