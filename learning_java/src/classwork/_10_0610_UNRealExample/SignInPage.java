package classwork._10_0610_UNRealExample;

import classwork._10_0610_UNRealExample.check.HasLoginField;
import classwork._10_0610_UNRealExample.check.HasPasswordField;
import classwork._10_0610_UNRealExample.check.HasSignInButton;
import classwork._10_0610_UNRealExample.loginPopUp.SignUpPopUp;

public class SignInPage extends BasePage implements HasLoginField, HasPasswordField, HasSignInButton {
    @Override
    public SignUpPopUp getSignUpPopUp() {
        return new SignUpPopUp();
    }
}
