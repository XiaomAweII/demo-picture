package com.maxiaowei.mypicturebackend.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 权限校验注解
 *
 * 使用: @AuthCheck(mustRole = UserConstant.ADMIN_ROLE)
 * <p>
 * 作者: maxiaowei
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AuthCheck {
    /**
     * 必须拥有某个角色
     *
     * @return
     */
    String mustRole() default "";
}
