package com.testBoot.config;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DatabaseConfig {
    public static SqlSessionFactory sqlMapper;

    static {
        // Configuration xml을 가져온다.
        String resource = "/properties/jdbcDatabase.yml";
        Reader reader; //

        try {
            reader = Resources.getResourceAsReader(resource);
            sqlMapper = new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSessionFactory getSqlMapper() {
        return sqlMapper;
    }
}
