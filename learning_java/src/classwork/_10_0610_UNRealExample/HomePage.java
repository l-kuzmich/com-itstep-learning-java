package classwork._10_0610_UNRealExample;

import classwork._10_0610_UNRealExample.check.HasCloseButton;
import classwork._10_0610_UNRealExample.check.HasOkButton;
import classwork._10_0610_UNRealExample.confirmPopUp.ConfirmPopUp;

public class HomePage extends BasePage implements HasCloseButton, HasOkButton {

    @Override
    public ConfirmPopUp getConfirmPopUp() {
        return new ConfirmPopUp();
    }

}
