package com.cyh.carmanager.api.dao.impl;

import com.cyh.carmanager.api.dao.AdminDao;
import com.cyh.carmanager.api.pojo.CarInformation;

import java.util.List;
import java.util.Optional;

import static com.cyh.carmanager.api.dao.BaseDao.execute;
import static com.cyh.carmanager.api.dao.BaseDao.query;

/**
 * @author cyh
 * @since 2024/5/23
 */
public class AdminDaoImpl implements AdminDao {

    @Override
    public List<CarInformation> setAll() {
        try {
            String sql = "select * form car_information";
            return query(CarInformation.class, "select * form car_information", null);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public CarInformation selectByCarId(Integer id) {
        String sql = "select * from car_information where id = ?";
        return null;
    }

    @Override
    public boolean insert(CarInformation carInformation) {
        String sql = "insert into car_information";
        try {
            return execute(sql, "carType","carower","price", "color", "hire",  "information", "username");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean updateCarById(Integer id, String carType, String carower, String price, String color, String hire, String information, String username) {
        return false;
    }

    @Override
    public boolean delete(Integer id) {
        String sql = "delete * form car_information where id = ?";
        try {
            return execute(sql,id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
