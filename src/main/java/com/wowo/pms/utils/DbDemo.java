package com.wowo.pms.utils;

import org.apache.commons.dbutils.QueryRunner;

import java.sql.SQLException;

public class DbDemo {

    public static void main(String[] args) throws SQLException {
        //QueryRunner
        QueryRunner queryRunner = new QueryRunner(C3p0Util.getDataSource());
        //update: insert update delete
        String sql = "insert into feature(feature_name) values(?)";
        queryRunner.update(sql,"项目管理");

    }

}
