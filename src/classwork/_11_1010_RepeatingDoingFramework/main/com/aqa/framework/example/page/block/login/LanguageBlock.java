package com.aqa.framework.example.page.block.login;

import com.aqa.framework.example.annotation.Block;
import com.aqa.framework.example.page.block.BaseBlock;
import com.aqa.framework.example.page.block_interface.language_element.HasLanguageElement;
import com.aqa.framework.example.page.block_interface.language_element.HasTitleLanguageElement;
import com.aqa.framework.example.page.element.login.language_element.LanguageElement;
import com.aqa.framework.example.page.element.login.language_element.TitleLanguageElement;

@Block(blockName = "Language login Block")
public class LanguageBlock extends BaseBlock implements HasLanguageElement, HasTitleLanguageElement {

    private LanguageElement languageElement = new LanguageElement("Selector for language element");
    private TitleLanguageElement titleLanguageElement = new TitleLanguageElement("Selector for title language");

    @Override
    public LanguageElement getLanguageElement() {
        return languageElement;
    }

    @Override
    public TitleLanguageElement getTitleLanguageElement() {
        return titleLanguageElement;
    }
}
