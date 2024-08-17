package db;

import model.Customer;

import java.util.ArrayList;
import java.util.List;

public class DBConnection {
    private static DBConnection instance = new DBConnection();
    private List<Customer> connection;
    private DBConnection() {
        connection = new ArrayList<>();
    }

    public List<Customer> getConnection() {
        return connection;
    }

    public static DBConnection getInstance() {
        if (null == instance) {
            return instance = new DBConnection();
        }
        return instance;
    }
}
