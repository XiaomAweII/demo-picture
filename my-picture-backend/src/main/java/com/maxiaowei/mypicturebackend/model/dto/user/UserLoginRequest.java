package com.maxiaowei.mypicturebackend.model.dto.user;

import lombok.Data;

import java.io.Serializable;

/**
 * 功能描述:
 * <p>
 * 作者: maxiaowei
 */
@Data
public class UserLoginRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 账号
     */
    private String userAccount;

    /**
     * 密码
     */
    private String userPassword;
}
