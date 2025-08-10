package com.maxiaowei.mypicturebackend.controller;

import com.maxiaowei.mypicturebackend.common.BaseResponse;
import com.maxiaowei.mypicturebackend.common.ResultUtils;
import com.maxiaowei.mypicturebackend.exception.ErrorCode;
import com.maxiaowei.mypicturebackend.exception.ThrowUtils;
import com.maxiaowei.mypicturebackend.model.dto.user.UserRegisterRequest;
import com.maxiaowei.mypicturebackend.model.entity.User;
import com.maxiaowei.mypicturebackend.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 功能描述:
 * <p>
 * 作者: maxiaowei
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    /**
     * 用户注册
     *
     * @param request
     * @return
     */
    @PostMapping("/register")
    public BaseResponse<Long> userRegister(@RequestBody UserRegisterRequest request) {
        ThrowUtils.throwIf(request == null, ErrorCode.PARAMS_ERROR);
        String userAccount = request.getUserAccount();
        String userPassword = request.getUserPassword();
        String checkPassword = request.getCheckPassword();
        long result = userService.userRegister(userAccount, userPassword, checkPassword);
        return ResultUtils.success(result);
    }
}
