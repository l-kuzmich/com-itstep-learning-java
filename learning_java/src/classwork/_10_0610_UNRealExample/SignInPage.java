package classwork._10_0610_RealExample;

import classwork._10_0610_RealExample.check.HasLoginField;
import classwork._10_0610_RealExample.check.HasPasswordField;
import classwork._10_0610_RealExample.check.HasSignInButton;
import classwork._10_0610_RealExample.loginPopUp.SignUpPopUp;

public class SignInPage extends BasePage implements HasLoginField, HasPasswordField, HasSignInButton {
    @Override
    public SignUpPopUp getSignUpPopUp() {
        return new SignUpPopUp();
    }
}
