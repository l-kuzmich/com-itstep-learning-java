package classwork._10_0610_RealExample.check;

import classwork._10_0610_RealExample.confirmPopUp.ConfirmPopUp;

public interface HasCloseButton {
    ConfirmPopUp getConfirmPopUp ();

    default void verifyCloseButton (){
        System.out.println(getConfirmPopUp().closeButton.confirm());
    }

}
