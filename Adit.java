class LoginService {

    public void login(String type) {

        if (type.equals("google")) {
            System.out.println("Login with Google");
        }

        else if (type.equals("facebook")) {
            System.out.println("Login with Facebook");
        }

        else if (type.equals("github")) {
            System.out.println("Login with Github");
        }

    }
}

public class Adit {
    public static void main(String[] args) {

        LoginService service = new LoginService();

        service.login("google");
    }
}