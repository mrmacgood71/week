package org.java.services;

import org.java.entyties.User;
import org.java.repositories.CommonRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class LoginService extends CommonRepository<User> {

    @Override
    protected List<User> selectAll() {

        return null;
    }

    public boolean signIn(String  userName, String password) {
        boolean isExist = false;
        try(Connection connection = getConnection()) {
            PreparedStatement login = connection.prepareStatement("select username, password, role from auth where username = ? and password = ?; ");
            login.setString(1, userName);
            login.setString(2, password);
            ResultSet userPredicate = login.executeQuery();

            if(userPredicate.next()) {
                isExist = true;

            } else isExist = false;

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return isExist;
    }
}
