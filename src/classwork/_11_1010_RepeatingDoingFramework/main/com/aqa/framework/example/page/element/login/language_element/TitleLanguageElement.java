package com.aqa.framework.example.page.element.login.language_element;

import com.aqa.framework.example.annotation.Element;
import com.aqa.framework.example.page.element.Label;

@Element(elementName = "Title Language Element")
public class TitleLanguageElement extends Label {

    public TitleLanguageElement(String elementSelector) {
        super(elementSelector);
    }
}
