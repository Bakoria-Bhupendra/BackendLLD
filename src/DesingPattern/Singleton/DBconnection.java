package DesingPattern.Singleton;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class DBconnection {
    private static DBconnection instance = null;
    String URL;
    String username;
    String password;
    List<Connection> pool;

    private DBconnection() {
        this.pool = new ArrayList<>();
    }

    public static DBconnection getInstance() {
        // code to initialize DB connection
        if (instance == null) {
            //Double check Locking mechanism to make it thread safe
            instance = new DBconnection();
            //Unlocking mechanism
        }
        return instance;
    }
}
