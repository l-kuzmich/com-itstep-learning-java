package classwork._10_0610_UNRealExample.check;

import classwork._10_0610_UNRealExample.loginPopUp.SignUpPopUp;

public interface HasSignInButton {
    SignUpPopUp getSignUpPopUp ();

    default void verifySignInButton (){
        System.out.println(getSignUpPopUp().singInButton.getButton());
    }
}
