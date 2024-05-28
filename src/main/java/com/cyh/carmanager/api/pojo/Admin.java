package com.cyh.carmanager.api.pojo;

import lombok.Data;

/**
 * 用户信息实体类
 *
 * @author cyh
 * @since 2024/5/22
 */
@Data
public class Admin {
    private String adminName;
    private String adminPassword;


    public Admin(String adminName, String adminPassword) {
        this.adminName = adminName;
        this.adminPassword = adminPassword;
    }
}
