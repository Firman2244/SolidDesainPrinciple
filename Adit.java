interface LoginProvider {
    void login();
}

class GoogleLogin implements LoginProvider {
    public void login() {
        System.out.println("Login with Google");
    }
}

class FacebookLogin implements LoginProvider {
    public void login() {
        System.out.println("Login with Facebook");
    }
}

class GithubLogin implements LoginProvider {
    public void login() {
        System.out.println("Login with Github");
    }
}

class LoginService {

    public void login(LoginProvider provider) {
        provider.login();
    }
}

public class Adit {
    public static void main(String[] args) {

        LoginService service = new LoginService();

        service.login(new GoogleLogin());
        service.login(new FacebookLogin());
        service.login(new GithubLogin());
    }
}
