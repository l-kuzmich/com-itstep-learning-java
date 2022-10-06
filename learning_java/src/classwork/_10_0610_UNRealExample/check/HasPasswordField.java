package classwork._10_0610_RealExample.check;

import classwork._10_0610_RealExample.loginPopUp.SignUpPopUp;

public interface HasPasswordField {
    SignUpPopUp getSignUpPopUp ();

    default void verifyPasswordField (){
        System.out.println(getSignUpPopUp().passwordField.getPassword());
    }
}
