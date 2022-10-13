package classwork._11_1010_RepeatingDoingFramework.main.com.aqa.framework.example.page;

import classwork._11_1010_RepeatingDoingFramework.main.com.aqa.framework.example.annotation.Page;
import classwork._11_1010_RepeatingDoingFramework.main.com.aqa.framework.example.page.block.login.LanguageBlock;
import classwork._11_1010_RepeatingDoingFramework.main.com.aqa.framework.example.page.block.login.LoginFormBlock;
import classwork._11_1010_RepeatingDoingFramework.main.com.aqa.framework.example.page.page_interface.login.HasLanguageBlock;
import classwork._11_1010_RepeatingDoingFramework.main.com.aqa.framework.example.page.page_interface.login.HasLoginFormBlock;

@Page(pageName = "Login page")
public class LoginPage extends BasePage implements HasLanguageBlock, HasLoginFormBlock {

    private LanguageBlock languageBlock = new LanguageBlock();
    private LoginFormBlock loginFormBlock = new LoginFormBlock();

    @Override
    public LanguageBlock getLanguageBlock() {
        return languageBlock;
    }

    @Override
    public LoginFormBlock getLoginFormBlock() {
        return loginFormBlock;
    }
}
