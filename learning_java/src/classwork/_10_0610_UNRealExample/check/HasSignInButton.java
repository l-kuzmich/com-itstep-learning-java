package classwork._10_0610_RealExample.check;

import classwork._10_0610_RealExample.loginPopUp.SignUpPopUp;

public interface HasSignInButton {
    SignUpPopUp getSignUpPopUp ();

    default void verifySignInButton (){
        System.out.println(getSignUpPopUp().singInButton.getButton());
    }
}
