package classwork._10_0610_RealExample.check;

import classwork._10_0610_RealExample.confirmPopUp.ConfirmPopUp;

public interface HasOkButton {
    ConfirmPopUp getConfirmPopUp ();


    default void verifyOkButton(){
        System.out.println(getConfirmPopUp().okButton.confirm());
    }
}
