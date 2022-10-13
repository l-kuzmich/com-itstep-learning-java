package com.aqa.framework.example.page.block.login;

import com.aqa.framework.example.annotation.Block;
import com.aqa.framework.example.page.block.BaseBlock;
import com.aqa.framework.example.page.block_interface.HasLoginButtonElement;
import com.aqa.framework.example.page.block_interface.HasLoginFieldElement;
import com.aqa.framework.example.page.block_interface.HasPasswordFieldElement;
import com.aqa.framework.example.page.block_interface.HasRecoveryPasswordElement;
import com.aqa.framework.example.page.element.login.LoginButtonElement;
import com.aqa.framework.example.page.element.login.LoginFieldElement;
import com.aqa.framework.example.page.element.login.PasswordFieldElement;
import com.aqa.framework.example.page.element.login.RecoveryPasswordElement;

@Block(blockName = "Login Form login Block")
public class LoginFormBlock extends BaseBlock implements HasLoginButtonElement, HasLoginFieldElement, HasPasswordFieldElement, HasRecoveryPasswordElement {

    public LoginButtonElement loginButtonElement = new LoginButtonElement("Selector for Login Button");
    public LoginFieldElement loginFieldElement = new LoginFieldElement("Selector for Login input");
    public PasswordFieldElement passwordFieldElement = new PasswordFieldElement("Selector for Password input");
    public RecoveryPasswordElement recoveryPasswordElement = new RecoveryPasswordElement("Selector for recovery link");

    @Override
    public LoginButtonElement getLoginButtonElement() {
        return loginButtonElement;
    }

    @Override
    public LoginFieldElement getLoginFieldElement() {
        return loginFieldElement;
    }

    @Override
    public PasswordFieldElement getPasswordFieldElement() {
        return passwordFieldElement;
    }

    @Override
    public RecoveryPasswordElement getRecoveryPasswordElement() {
        return recoveryPasswordElement;
    }
}
