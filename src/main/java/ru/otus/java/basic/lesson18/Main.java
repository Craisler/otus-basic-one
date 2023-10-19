//package ru.otus.java.basic.lesson18;
//
//import java.sql.*;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Scanner;
//
//public class Main {
//    public static final String DATABASE_URL = "jdbs:postgresql://localhost:5433/my_bd";
//
//    /**
//     * user(id PRIMARY KEY,login,password)
//     * roles(id,roles_name)
//     * user_to_roles (user_id, role_id)
//     * create table user_to_roles(
//     * user_id integer,
//     * role_id integer,
//     * constraint user_id_fk ON user_id
//     * constraint primary [key(user_id,role_id)
//     *
//     * @param args
//     */
//
//    public static final String SELECT_USER_WITH_ROLE = "SELECT u.id as id, u.login as login, u.password as password FROM user_to_roles" +
//            "JOIN users u ON user_id=u.id" +
//            "JOIN roles r ON role_id=r.id" +
//            "WHERE r.roles_name = ?";
//
//
//    public static void main(String[] args) {
//        List<User> result = new ArrayList<>();
//        Scanner scanner = new Scanner(System.in);
//        String roleName = scanner.nextLine();
//        try (Connection connection = DriverManager.getConnection(DATABASE_URL)) {
//            try (PreparedStatement ps = connection.prepareStatement(SELECT_USER_WITH_ROLE)) {
//                ps.setString(1, roleName);
//                try (ResultSet rs = ps.executeQuery()) {
//                    while (rs.next()) {
//                        long id = rs.getLong("id");
//                        String login = rs.getString("login");
//                        String password = rs.getString("password");
//                        User user = new User(id, login, password);
//                        ((ArrayList<?>) result).add(user);
//                    }
//                }
//            } catch (SQLException e) {
//
//            }
//        } catch (SQLException e) {
//        }
//    }
//}