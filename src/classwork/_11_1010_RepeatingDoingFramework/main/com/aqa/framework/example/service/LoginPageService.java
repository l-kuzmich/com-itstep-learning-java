package classwork._11_1010_RepeatingDoingFramework.main.com.aqa.framework.example.service;

import classwork._11_1010_RepeatingDoingFramework.main.com.aqa.framework.example.annotation.Service;
import classwork._11_1010_RepeatingDoingFramework.main.com.aqa.framework.example.page.LoginPage;
import classwork._11_1010_RepeatingDoingFramework.main.com.aqa.framework.example.service.service_interface.HasLoginPage;

@Service(serviceName = "Login page service")
public class LoginPageService extends BaseService implements HasLoginPage {

    private LoginPage loginPage = new LoginPage();

    @Override
    public LoginPage getLoginPage() {
        return loginPage;
    }
}
