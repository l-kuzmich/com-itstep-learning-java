package com.aqa.framework.example.page;

import com.aqa.framework.example.annotation.Page;
import com.aqa.framework.example.page.block.TopMenuBlock;
import com.aqa.framework.example.page.block.left_menu.FooterLeftMenuBlock;
import com.aqa.framework.example.page.block.left_menu.HeaderLeftMenuBlock;
import com.aqa.framework.example.page.block.left_menu.NavigationLeftMenuBlock;
import com.aqa.framework.example.page.block.login.LanguageBlock;
import com.aqa.framework.example.page.block.login.LoginFormBlock;
import com.aqa.framework.example.page.page_interface.HasTopMenuBlock;
import com.aqa.framework.example.page.page_interface.left_menu.HasFooterLeftMenuBlock;
import com.aqa.framework.example.page.page_interface.left_menu.HasHeaderLeftMenuBlock;
import com.aqa.framework.example.page.page_interface.left_menu.HasNavigationLeftMenuBlock;
import com.aqa.framework.example.page.page_interface.login.HasLanguageBlock;
import com.aqa.framework.example.page.page_interface.login.HasLoginFormBlock;

@Page(pageName = "Login page")
public class LoginPage extends BasePage implements HasTopMenuBlock, HasFooterLeftMenuBlock, HasHeaderLeftMenuBlock,
        HasNavigationLeftMenuBlock, HasLanguageBlock, HasLoginFormBlock {

    private TopMenuBlock topMenuBlock = new TopMenuBlock();
    private FooterLeftMenuBlock footerLeftMenuBlock = new FooterLeftMenuBlock();
    private HeaderLeftMenuBlock headerLeftMenuBlock = new HeaderLeftMenuBlock();
    private NavigationLeftMenuBlock navigationLeftMenuBlock = new NavigationLeftMenuBlock();
    private LanguageBlock languageBlock = new LanguageBlock();
    private LoginFormBlock loginFormBlock = new LoginFormBlock();


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
    public LanguageBlock getLanguageBlock() {
        return languageBlock;
    }

    @Override
    public LoginFormBlock getLoginFormBlock() {
        return loginFormBlock;
    }
}
