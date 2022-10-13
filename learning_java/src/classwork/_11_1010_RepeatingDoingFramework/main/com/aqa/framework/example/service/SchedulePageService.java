package com.aqa.framework.example.service;

import com.aqa.framework.example.annotation.Service;
import com.aqa.framework.example.page.SchedulePage;
import com.aqa.framework.example.service.service_interface.HasSchedulePage;

@Service(serviceName = "Schedule page service")
public class SchedulePageService extends BaseService implements HasSchedulePage {

    private SchedulePage schedulePage = new SchedulePage();

    @Override
    public SchedulePage getSchedulePage() {
        return schedulePage;
    }
}
