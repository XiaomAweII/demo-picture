package com.maxiaowei.mypicturebackend.service;

import com.maxiaowei.mypicturebackend.model.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.maxiaowei.mypicturebackend.model.vo.LoginUserVO;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Administrator
 * @description 针对表【user(用户)】的数据库操作Service
 * @createDate 2025-08-10 14:41:58
 */
public interface UserService extends IService<User> {
    /**
     * 用户注册
     *
     * @param userAccount   用户账户
     * @param userPassword  用户密码
     * @param checkPassword 校验密码
     * @return 新用户id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword);

    /**
     * 用户登录
     *
     * @param userAccount  用户账户
     * @param userPassword 用户密码
     * @param request
     * @return 脱敏后的用户信息
     */
    LoginUserVO userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * 获取加密后的密码
     *
     * @param userPassword
     * @return
     */
    String getEncryptPassword(String userPassword);

    /**
     * 获得脱敏后的登录用户信息
     *
     * @param user
     * @return
     */
    LoginUserVO getLoginUserVO(User user);
}
