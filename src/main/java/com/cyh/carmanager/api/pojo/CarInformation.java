package com.cyh.carmanager.api.pojo;

import lombok.Data;

/**
 * 车辆信息实体类
 *
 * @author cyh
 * @since 2024/5/22
 */
@Data
public class CarInformation {
    private Integer number;
    private String carType;
    private String carower;
    private String price;
    private String color;
    private String hire;
    private String information;
    private String username;

    public CarInformation(Integer number, String carType, String carower, String price, String color, String hire, String information, String username) {
        this.number = number;
        this.carType = carType;
        this.carower = carower;
        this.price = price;
        this.color = color;
        this.hire = hire;
        this.information = information;
        this.username = username;
    }
}
