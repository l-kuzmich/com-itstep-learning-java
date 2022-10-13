package classwork._10_0610_UNRealExample;

public class MainClass {
    public static void main(String[] args) {

        HomePage homePage = new HomePage();
        homePage.verifyCloseButton();
        homePage.verifyOkButton();

        SignInPage signInPage = new SignInPage();
        signInPage.verifyLoginField();
        signInPage.verifyPasswordField();
        signInPage.verifySignInButton();

    }
}
