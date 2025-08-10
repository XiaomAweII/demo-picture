package com.maxiaowei.mypicturebackend.model.enums;

import cn.hutool.core.util.ObjUtil;
import com.maxiaowei.mypicturebackend.model.entity.User;
import lombok.Getter;

/**
 * 用户角色枚举
 * <p>
 * 作者: maxiaowei
 */
@Getter
public enum UserRoleEnum {
    USER("用户", "user"),
    VIP("会员", "vip"),
    ADMIN("管理员", "admin");

    private final String test;
    private final String value;

    UserRoleEnum(String test, String value) {
        this.test = test;
        this.value = value;
    }

    /**
     * 根据 value 获取枚举
     *
     * @param value 枚举值的 value
     * @return 枚举值
     */
    public static UserRoleEnum getEnumByValue(String value) {
        if (ObjUtil.isEmpty(value)) {
            return null;
        }
        for (UserRoleEnum userRoleEnum : UserRoleEnum.values()) {
            if (userRoleEnum.value.equals(value)) {
                return userRoleEnum;
            }
        }
        return null;
    }
}
