// Abstraction / Interface
interface Database {
    void connect();
}

// Implementasi MySQL
class MySQLDatabase implements Database {

    @Override
    public void connect() {
        System.out.println("Terhubung ke MySQL Database");
    }
}

// Implementasi database lain (opsional)
class PostgreSQLDatabase implements Database {

    @Override
    public void connect() {
        System.out.println("Terhubung ke PostgreSQL Database");
    }
}

// UserService sekarang bergantung pada abstraction
class UserService {

    private Database database;

    // Dependency Injection melalui constructor
    public UserService(Database database) {
        this.database = database;
    }

    public void saveUser() {

        database.connect();

        System.out.println("Data user berhasil disimpan");
    }
}

public class Main {

    public static void main(String[] args) {

        // Bisa menggunakan MySQL
        Database mysql = new MySQLDatabase();
        UserService service1 = new UserService(mysql);
        service1.saveUser();

        System.out.println();

        // Bisa diganti PostgreSQL tanpa mengubah UserService
        Database postgres = new PostgreSQLDatabase();
        UserService service2 = new UserService(postgres);
        service2.saveUser();
    }
}
