package com.cyh.carmanager.api.dao;

import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author cyh
 * @since 2024/5/22
 */
public class BaseDao {
    /**
     * 增删改通用方法
     *
     * @param sql
     * @param params 站位符
     * @return
     */
    public static boolean execute(String sql, Object... params) throws Exception {
        Connection connection = JDBCUtil.getConnection();

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        if (params != null && params.length > 0) {
            for (int i = 0; i < params.length; i++) {
                preparedStatement.setObject(i + 1, params[i]);
            }
        }
        return preparedStatement.executeUpdate() > 0;

    }

    /**
     * 泛型查询方法
     *
     * @param clazz  查询的类
     * @param sql
     * @param params 参数
     * @param <T>
     * @return
     * @throws Exception
     */
    public static <T> List<T> query(Class<T> clazz, String sql, Object... params) throws Exception {
        Connection connection = JDBCUtil.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        if (params != null && params.length > 0) {
            for (int i = 0; i < params.length; i++) {
                preparedStatement.setObject(i + 1, params[i]);
            }
        }
        ResultSet resultSet = preparedStatement.executeQuery();
        List<T> list = new ArrayList<>();
        ResultSetMetaData metaData = resultSet.getMetaData();
        int columnCount = metaData.getColumnCount();
        while (resultSet.next()) {
            T t = clazz.newInstance();
            for (int i = 0; i < columnCount; i++) {
                // 通过下标获取列的值
                Object value = resultSet.getObject(i + 1);
                // 获取字段名称 = 对象的属性名
                String fieldName = metaData.getColumnLabel(i);
                Field field = clazz.getDeclaredField(fieldName);
                // 突破封装
                field.setAccessible(true);
                field.set(t, value);
            }
            list.add(t);
        }
        return list;
    }

    /**
     * 查询单条信息
     *
     * @param clazz
     * @param sql
     * @param params
     * @param <T>
     * @return
     * @throws Exception
     */
    public static <T> List<T> queryFindId(Class<T> clazz, String sql, Object... params) throws Exception {
        Connection connection = JDBCUtil.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        if (params != null && params.length > 0) {
            for (int i = 0; i < params.length; i++) {
                preparedStatement.setObject(i + 1, params[i]);
            }
        }
        ResultSet resultSet = preparedStatement.executeQuery();
        List<T> list = new ArrayList<>();
        ResultSetMetaData metaData = resultSet.getMetaData();
        int columnCount = metaData.getColumnCount();
        return null;
    }

    /**
     * 查询单条信息2
     *
     * @param clazz
     * @param sql
     * @param params
     * @param <T>
     * @return
     * @throws Exception
     */
    public <T> T queryFindId2(Class<T> clazz, String sql, Object... params) throws Exception {
        List<T> list = this.query(clazz, sql, params);
        if (list != null && list.size() == 0) {
            return null;
        }
        return list.get(0);
    }
}
