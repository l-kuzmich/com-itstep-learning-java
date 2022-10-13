package classwork._11_1010_RepeatingDoingFramework.main.com.aqa.framework.example.service;

import classwork._11_1010_RepeatingDoingFramework.main.com.aqa.framework.example.annotation.Service;
import classwork._11_1010_RepeatingDoingFramework.main.com.aqa.framework.example.page.PresentPage;
import classwork._11_1010_RepeatingDoingFramework.main.com.aqa.framework.example.service.service_interface.HasPresentPage;

@Service(serviceName = "Present page service")
public class PresentPageService extends BaseService implements HasPresentPage {

    private PresentPage presentPage = new PresentPage();

    @Override
    public PresentPage getPresentPage() {
        return presentPage;
    }
}
