package com.aqa.framework.example.page.element.login.language_element;

import com.aqa.framework.example.annotation.Element;
import com.aqa.framework.example.page.element.Link;

@Element(elementName = "Language Element")
public class LanguageElement extends Link {
    public LanguageElement(String elementSelector) {
        super(elementSelector);
    }
}
