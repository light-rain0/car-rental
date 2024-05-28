package com.cyh.carmanager.api.dao;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author cyh
 * @since 2024/5/22
 */
public class JDBCUtil {

    // 创建连接池对象
    private final static DataSource dataSource;
    private final static ThreadLocal<Connection> threadLocal = new ThreadLocal<>();

    static {

        try {
            Properties properties = new Properties();
            InputStream inputStream = JDBCUtil.class.getClassLoader().getResourceAsStream("db.properties");
            properties.load(inputStream);

            // 连接池对象
            dataSource = DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // 对外提供连接池中获取连接的方法
    public static Connection getConnection() {
        try {
            Connection connection = threadLocal.get();
            if (connection == null) {
                connection = dataSource.getConnection();
                threadLocal.set(connection);
            }
            return connection;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    // 回收方法
    public static void release() {
        try {
            Connection connection = threadLocal.get();
            if (connection != null) {
                threadLocal.remove();

                // 归还连接池
                connection.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
