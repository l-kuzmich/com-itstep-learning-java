package com.aqa.framework.example.service;

import com.aqa.framework.example.annotation.Service;
import com.aqa.framework.example.page.LoginPage;
import com.aqa.framework.example.service.service_interface.HasLoginPage;

@Service(serviceName = "Login page service")
public class LoginPageService extends BaseService implements HasLoginPage {

    private LoginPage loginPage = new LoginPage();

    @Override
    public LoginPage getLoginPage() {
        return loginPage;
    }
}
