package com.cyh.carmanager.api.pojo;

import lombok.Data;

/**
 * 用户信息实体类
 *
 * @author cyh
 * @since 2024/5/22
 */
@Data
public class User {
    private String userName;
    private String userPassword;

    public User(String userName, String userPassword) {
        this.userName = userName;
        this.userPassword = userPassword;
    }
}
