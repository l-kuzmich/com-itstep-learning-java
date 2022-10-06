package classwork._10_0610_RealExample;

import classwork._10_0610_RealExample.check.HasCloseButton;
import classwork._10_0610_RealExample.check.HasOkButton;
import classwork._10_0610_RealExample.confirmPopUp.ConfirmPopUp;

public class HomePage extends BasePage implements HasCloseButton, HasOkButton {

    @Override
    public ConfirmPopUp getConfirmPopUp() {
        return new ConfirmPopUp();
    }

}
