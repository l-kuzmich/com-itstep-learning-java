package com.aqa.framework.example.service;

import com.aqa.framework.example.annotation.Service;
import com.aqa.framework.example.page.MainPage;
import com.aqa.framework.example.service.service_interface.HasMainPage;

@Service(serviceName = "Main page service")
public class MainPageService extends BaseService implements HasMainPage {

    private MainPage mainPage = new MainPage();

    @Override
    public MainPage getMainPage() {
        return mainPage;
    }
}
