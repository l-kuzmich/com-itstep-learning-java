package classwork._11_1010_RepeatingDoingFramework.main.com.aqa.framework.example.page;

import classwork._11_1010_RepeatingDoingFramework.main.com.aqa.framework.example.annotation.Page;
import classwork._11_1010_RepeatingDoingFramework.main.com.aqa.framework.example.page.block.TopMenuBlock;
import classwork._11_1010_RepeatingDoingFramework.main.com.aqa.framework.example.page.block.left_menu.FooterLeftMenuBlock;
import classwork._11_1010_RepeatingDoingFramework.main.com.aqa.framework.example.page.block.left_menu.HeaderLeftMenuBlock;
import classwork._11_1010_RepeatingDoingFramework.main.com.aqa.framework.example.page.block.left_menu.NavigationLeftMenuBlock;
import classwork._11_1010_RepeatingDoingFramework.main.com.aqa.framework.example.page.block.present.HeaderBlock;
import classwork._11_1010_RepeatingDoingFramework.main.com.aqa.framework.example.page.block.present.MaterialInformationBlock;
import classwork._11_1010_RepeatingDoingFramework.main.com.aqa.framework.example.page.block.present.NavigationBlock;
import classwork._11_1010_RepeatingDoingFramework.main.com.aqa.framework.example.page.block.present.StudentsTableBlock;
import classwork._11_1010_RepeatingDoingFramework.main.com.aqa.framework.example.page.page_interface.HasTopMenuBlock;
import classwork._11_1010_RepeatingDoingFramework.main.com.aqa.framework.example.page.page_interface.left_menu.HasFooterLeftMenuBlock;
import classwork._11_1010_RepeatingDoingFramework.main.com.aqa.framework.example.page.page_interface.left_menu.HasHeaderLeftMenuBlock;
import classwork._11_1010_RepeatingDoingFramework.main.com.aqa.framework.example.page.page_interface.left_menu.HasNavigationLeftMenuBlock;
import classwork._11_1010_RepeatingDoingFramework.main.com.aqa.framework.example.page.page_interface.present.HasHeaderBlock;
import classwork._11_1010_RepeatingDoingFramework.main.com.aqa.framework.example.page.page_interface.present.HasMaterialInformationBlock;
import classwork._11_1010_RepeatingDoingFramework.main.com.aqa.framework.example.page.page_interface.present.HasNavigationBlock;
import classwork._11_1010_RepeatingDoingFramework.main.com.aqa.framework.example.page.page_interface.present.HasStudentsTableBlock;

@Page(pageName = "Present page")
public class PresentPage extends BasePage implements HasTopMenuBlock, HasFooterLeftMenuBlock, HasHeaderLeftMenuBlock,
        HasNavigationLeftMenuBlock, HasHeaderBlock, HasMaterialInformationBlock, HasNavigationBlock, HasStudentsTableBlock {

    private TopMenuBlock topMenuBlock = new TopMenuBlock();
    private FooterLeftMenuBlock footerLeftMenuBlock = new FooterLeftMenuBlock();
    private HeaderLeftMenuBlock headerLeftMenuBlock = new HeaderLeftMenuBlock();
    private NavigationLeftMenuBlock navigationLeftMenuBlock = new NavigationLeftMenuBlock();
    private HeaderBlock headerBlock = new HeaderBlock();
    private MaterialInformationBlock materialInformationBlock = new MaterialInformationBlock();
    private NavigationBlock navigationBlock = new NavigationBlock();
    private StudentsTableBlock studentsTableBlock = new StudentsTableBlock();

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

    @Override
    public HeaderBlock getHeaderBlock() {
        return headerBlock;
    }

    @Override
    public MaterialInformationBlock getMaterialInformationBlock() {
        return materialInformationBlock;
    }

    @Override
    public NavigationBlock getNavigationBlock() {
        return navigationBlock;
    }

    @Override
    public StudentsTableBlock getStudentsTableBlock() {
        return studentsTableBlock;
    }
}
