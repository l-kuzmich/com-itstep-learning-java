package classwork._10_0610_UNRealExample.check;

import classwork._10_0610_UNRealExample.confirmPopUp.ConfirmPopUp;

public interface HasCloseButton {
    ConfirmPopUp getConfirmPopUp ();

    default void verifyCloseButton (){
        System.out.println(getConfirmPopUp().closeButton.confirm());
    }

}
