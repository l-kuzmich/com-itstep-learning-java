package classwork._10_0610_RealExample.check;

import classwork._10_0610_RealExample.loginPopUp.SignUpPopUp;

public interface HasLoginField {
    SignUpPopUp getSignUpPopUp ();

    default void verifyLoginField (){
        System.out.println(getSignUpPopUp().loginField.getLogin());
    }

}
