package classwork._11_1010_RepeatingDoingFramework.main.com.aqa.framework.example.page;

import classwork._11_1010_RepeatingDoingFramework.main.com.aqa.framework.example.annotation.Page;
import classwork._11_1010_RepeatingDoingFramework.main.com.aqa.framework.example.page.block.TopMenuBlock;
import classwork._11_1010_RepeatingDoingFramework.main.com.aqa.framework.example.page.block.left_menu.FooterLeftMenuBlock;
import classwork._11_1010_RepeatingDoingFramework.main.com.aqa.framework.example.page.block.left_menu.HeaderLeftMenuBlock;
import classwork._11_1010_RepeatingDoingFramework.main.com.aqa.framework.example.page.block.left_menu.NavigationLeftMenuBlock;
import classwork._11_1010_RepeatingDoingFramework.main.com.aqa.framework.example.page.page_interface.HasTopMenuBlock;
import classwork._11_1010_RepeatingDoingFramework.main.com.aqa.framework.example.page.page_interface.left_menu.HasFooterLeftMenuBlock;
import classwork._11_1010_RepeatingDoingFramework.main.com.aqa.framework.example.page.page_interface.left_menu.HasHeaderLeftMenuBlock;
import classwork._11_1010_RepeatingDoingFramework.main.com.aqa.framework.example.page.page_interface.left_menu.HasNavigationLeftMenuBlock;

@Page(pageName = "Schedule page")
public class SchedulePage extends BasePage implements HasTopMenuBlock, HasFooterLeftMenuBlock, HasHeaderLeftMenuBlock,
        HasNavigationLeftMenuBlock {

    private TopMenuBlock topMenuBlock = new TopMenuBlock();
    private FooterLeftMenuBlock footerLeftMenuBlock = new FooterLeftMenuBlock();
    private HeaderLeftMenuBlock headerLeftMenuBlock = new HeaderLeftMenuBlock();
    private NavigationLeftMenuBlock navigationLeftMenuBlock = new NavigationLeftMenuBlock();

    @Override
    public TopMenuBlock getTopMenuBlock() {
        return topMenuBlock;
    }


    @Override
    public FooterLeftMenuBlock getFooterLeftMenuBlock() {
        return footerLeftMenuBlock;
    }

    @Override
    public HeaderLeftMenuBlock getHeaderLeftMenuBlock() {
        return headerLeftMenuBlock;
    }

    @Override
    public NavigationLeftMenuBlock getNavigationLeftMenuBlock() {
        return navigationLeftMenuBlock;
    }
}
