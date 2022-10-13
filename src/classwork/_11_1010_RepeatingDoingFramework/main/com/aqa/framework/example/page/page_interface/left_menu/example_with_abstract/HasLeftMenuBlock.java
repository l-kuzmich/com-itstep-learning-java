package com.aqa.framework.example.page.page_interface.left_menu.example_with_abstract;

import com.aqa.framework.example.page.block.left_menu.LeftMenuBlock;

public interface HasLeftMenuBlock {

    LeftMenuBlock getFooterLeftMenuBlock();
    LeftMenuBlock getHeaderLeftMenuBlock();
    LeftMenuBlock getNavigationLeftMenuBlock();
}
