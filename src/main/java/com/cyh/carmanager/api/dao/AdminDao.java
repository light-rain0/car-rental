package com.cyh.carmanager.api.dao;

import com.cyh.carmanager.api.pojo.CarInformation;

import java.util.List;
import java.util.Optional;

/**
 * 管理员相关存储操作
 *
 * @author cyh
 * @since 2024/5/22
 */
public interface AdminDao {

    /**
     * 查询所有数据
     *
     * @return 返回所有数据
     */
    List<CarInformation> setAll() throws Exception;

    /**
     * 根据id查找单个数据
     *
     * @param id 查询id
     * @return 返回查询单条的结果
     */
    CarInformation selectByCarId(Integer id);

    /**
     * 插入一条数据
     *
     * @param carInformation 添加的数据
     * @return 是否添加成功
     */
    boolean insert(CarInformation carInformation);


    /**
     * 根据ID更新数据
     *
     * @param id
     * @param carType
     * @param carower
     * @param price
     * @param color
     * @param hire
     * @param information
     * @param username
     * @return
     */
    boolean updateCarById(Integer id, String carType, String carower, String price, String color, String hire, String information, String username);

    /**
     * 删除一条数据
     *
     * @param id
     * @return
     */
    boolean delete(Integer id);
}
