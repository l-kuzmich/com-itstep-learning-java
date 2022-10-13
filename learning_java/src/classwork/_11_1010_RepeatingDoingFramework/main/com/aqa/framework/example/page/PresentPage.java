package com.aqa.framework.example.page;

import com.aqa.framework.example.annotation.Page;
import com.aqa.framework.example.page.block.TopMenuBlock;
import com.aqa.framework.example.page.block.left_menu.FooterLeftMenuBlock;
import com.aqa.framework.example.page.block.left_menu.HeaderLeftMenuBlock;
import com.aqa.framework.example.page.block.left_menu.NavigationLeftMenuBlock;
import com.aqa.framework.example.page.block.present.HeaderBlock;
import com.aqa.framework.example.page.block.present.MaterialInformationBlock;
import com.aqa.framework.example.page.block.present.NavigationBlock;
import com.aqa.framework.example.page.block.present.StudentsTableBlock;
import com.aqa.framework.example.page.page_interface.HasTopMenuBlock;
import com.aqa.framework.example.page.page_interface.left_menu.HasFooterLeftMenuBlock;
import com.aqa.framework.example.page.page_interface.left_menu.HasHeaderLeftMenuBlock;
import com.aqa.framework.example.page.page_interface.left_menu.HasNavigationLeftMenuBlock;
import com.aqa.framework.example.page.page_interface.present.HasHeaderBlock;
import com.aqa.framework.example.page.page_interface.present.HasMaterialInformationBlock;
import com.aqa.framework.example.page.page_interface.present.HasNavigationBlock;
import com.aqa.framework.example.page.page_interface.present.HasStudentsTableBlock;

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
