package classwork._11_1010_RepeatingDoingFramework.main.com.aqa.framework.example.service;

import classwork._11_1010_RepeatingDoingFramework.main.com.aqa.framework.example.annotation.Service;
import classwork._11_1010_RepeatingDoingFramework.main.com.aqa.framework.example.page.SchedulePage;
import classwork._11_1010_RepeatingDoingFramework.main.com.aqa.framework.example.service.service_interface.HasSchedulePage;

@Service(serviceName = "Schedule page service")
public class SchedulePageService extends BaseService implements HasSchedulePage {

    private SchedulePage schedulePage = new SchedulePage();

    @Override
    public SchedulePage getSchedulePage() {
        return schedulePage;
    }
}
