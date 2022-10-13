package classwork._10_0610_UNRealExample.check;

import classwork._10_0610_UNRealExample.confirmPopUp.ConfirmPopUp;

public interface HasOkButton {
    ConfirmPopUp getConfirmPopUp ();

    default void verifyOkButton(){
        System.out.println(getConfirmPopUp().okButton.confirm());
    }
}
