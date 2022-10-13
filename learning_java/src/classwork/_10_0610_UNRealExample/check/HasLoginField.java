package classwork._10_0610_UNRealExample.check;

import classwork._10_0610_UNRealExample.loginPopUp.SignUpPopUp;

public interface HasLoginField {
    SignUpPopUp getSignUpPopUp ();

    default void verifyLoginField (){
        System.out.println(getSignUpPopUp().loginField.getLogin());
    }

}
