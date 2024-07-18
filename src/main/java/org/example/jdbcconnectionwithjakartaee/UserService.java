package org.example.jdbcconnectionwithjakartaee;

import org.postgresql.Driver;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserService {

    public void add(User user) {
        try {
            DriverManager.registerDriver(new Driver());
            String url = "jdbc:postgresql://localhost:5432/product";
            String dbuser = "postgres";
            String password = "Root12345";

            var connection = DriverManager.getConnection(url, dbuser, password);
            var statement = connection.createStatement();
            var rs = statement.executeQuery("insert into users values (" + user.getId() + ", '" + user.getLast_name() + "', '" + user.getFirst_name() + "', '" + user.getPassword() + "');");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<User> getAll() {
        var users = new ArrayList<User>();
        try {
            DriverManager.registerDriver(new Driver());

            String url = "jdbc:postgresql://localhost:5432/product";
            String dbuser = "postgres";
            String password = "Root12345";

            var connection = DriverManager.getConnection(url, dbuser, password);

            var statement = connection.prepareStatement("select * from users;");

            var rs = statement.executeQuery();

            while (rs.next()) {
                var user = User.builder()
                        .id(rs.getInt("id"))
                        .last_name(rs.getString("last_name"))
                        .first_name(rs.getString("first_name"))
                        .password(rs.getString("password"))
                        .build();

                users.add(user);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return users;
    }

    public User get(int id) {
        try {
            DriverManager.registerDriver(new Driver());

            String url = "jdbc:postgresql://localhost:5432/product";
            String dbuser = "postgres";
            String password = "Root12345";

            var connection = DriverManager.getConnection(url, dbuser, password);

            var statement = connection.prepareStatement("select * from users b where b.id = ?;");

            statement.setInt(1, id);

            var rs = statement.executeQuery();

            if (rs.next()) {
                return User.builder()
                        .id(rs.getInt("id"))
                        .last_name(rs.getString("last_name"))
                        .first_name(rs.getString("first_name"))
                        .password(rs.getString("password"))
                        .build();
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

}
