package pages;

public class LoginPage extends BasePage {

    private static final String urlLoginPage = "https://www.saucedemo.com/";

    private static final String idLoginButton = "login-button";

    private static final String idUserName = "user-name";

    private static final String idPassword = "password";

    private static final String userName = "standard_user";

    private static final String password = "secret_sauce";

    private static final String fakeUserName = "fakeUsername";

    private static final String fakePassword = "fakePassword";

    public static String getFakePassword() {
        return fakePassword;
    }

    public static String getFakeUserName() {
        return fakeUserName;
    }

    public static String getPassword() {
        return password;
    }

    public static String getUserName() {
        return userName;
    }

    public static String getIdUserName() {
        return idUserName;
    }

    public static String getIdPassword() {
        return idPassword;
    }

    public static String getUrlLoginPage() {
        return urlLoginPage;
    }

    public static String getIdLoginButton() {
        return idLoginButton;
    }

}
