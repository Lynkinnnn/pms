package com.wowo.pms.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.ConnectionPoolDataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class C3p0Demo {

    public static void main(String[] args) throws SQLException {

        ComboPooledDataSource ds = new ComboPooledDataSource();

        Connection con = ds.getConnection();
        System.out.println(con);

    }
}
