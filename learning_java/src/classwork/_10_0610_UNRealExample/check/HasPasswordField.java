package classwork._10_0610_UNRealExample.check;

import classwork._10_0610_UNRealExample.loginPopUp.SignUpPopUp;

public interface HasPasswordField {
    SignUpPopUp getSignUpPopUp ();

    default void verifyPasswordField (){
        System.out.println(getSignUpPopUp().passwordField.getPassword());
    }
}
