class MySQLDatabase {

    public void connect() {
        System.out.println("Terhubung ke MySQL Database");
    }
}

class UserService {

    
    private MySQLDatabase database = new MySQLDatabase();

    public void saveUser() {

        database.connect();

        System.out.println("Data user berhasil disimpan");
    }
};

public class Deca {

    public static void main(String[] args) {

        UserService service = new UserService();

        service.saveUser();
    }
};