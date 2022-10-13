package com.aqa.framework.example.service;

import com.aqa.framework.example.annotation.Service;
import com.aqa.framework.example.page.PresentPage;
import com.aqa.framework.example.service.service_interface.HasPresentPage;

@Service(serviceName = "Present page service")
public class PresentPageService extends BaseService implements HasPresentPage {

    private PresentPage presentPage = new PresentPage();

    @Override
    public PresentPage getPresentPage() {
        return presentPage;
    }
}
