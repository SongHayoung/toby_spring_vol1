package com.newbie.Spring_Newbie.User.dao;

import java.sql.*;

public class UserDaoDeleteAll extends UserDaoJdbc {
    protected PreparedStatement makeStatement(Connection c) throws SQLException{
        PreparedStatement ps = c.prepareStatement("delete from users");
        return ps;
    }
}
