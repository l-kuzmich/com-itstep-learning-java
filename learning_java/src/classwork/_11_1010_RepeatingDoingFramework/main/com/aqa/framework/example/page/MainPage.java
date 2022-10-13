package com.aqa.framework.example.page;

import com.aqa.framework.example.annotation.Page;
import com.aqa.framework.example.page.block.TopMenuBlock;
import com.aqa.framework.example.page.block.left_menu.FooterLeftMenuBlock;
import com.aqa.framework.example.page.block.left_menu.HeaderLeftMenuBlock;
import com.aqa.framework.example.page.block.left_menu.LeftMenuBlock;
import com.aqa.framework.example.page.block.left_menu.NavigationLeftMenuBlock;
import com.aqa.framework.example.page.block.main.EventBlock;
import com.aqa.framework.example.page.block.main.NewsBlock;
import com.aqa.framework.example.page.page_interface.HasTopMenuBlock;
import com.aqa.framework.example.page.page_interface.left_menu.HasFooterLeftMenuBlock;
import com.aqa.framework.example.page.page_interface.left_menu.HasHeaderLeftMenuBlock;
import com.aqa.framework.example.page.page_interface.left_menu.HasNavigationLeftMenuBlock;
import com.aqa.framework.example.page.page_interface.main.HasEventBlock;
import com.aqa.framework.example.page.page_interface.main.HasNewsBlock;

@Page(pageName = "Main page")
public class MainPage extends BasePage implements HasTopMenuBlock, HasFooterLeftMenuBlock, HasHeaderLeftMenuBlock,
        HasNavigationLeftMenuBlock, HasEventBlock, HasNewsBlock {

    private TopMenuBlock topMenuBlock = new TopMenuBlock();
    private FooterLeftMenuBlock footerLeftMenuBlock = new FooterLeftMenuBlock();
    private HeaderLeftMenuBlock headerLeftMenuBlock = new HeaderLeftMenuBlock();
    private NavigationLeftMenuBlock navigationLeftMenuBlock = new NavigationLeftMenuBlock();
    private EventBlock eventBlock = new EventBlock();
    private NewsBlock newsBlock = new NewsBlock();

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
    public EventBlock getEventBlock() {
        return eventBlock;
    }

    @Override
    public NewsBlock getNewsBlock() {
        return newsBlock;
    }
}
