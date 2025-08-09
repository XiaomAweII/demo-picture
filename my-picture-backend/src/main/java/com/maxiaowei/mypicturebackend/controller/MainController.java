package com.maxiaowei.mypicturebackend.controller;

import com.maxiaowei.mypicturebackend.common.BaseResponse;
import com.maxiaowei.mypicturebackend.common.ResultUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 示例接口
 * <p>
 * 作者: maxiaowei
 */
@RestController
@RequestMapping("/")
public class MainController {
    /**
     * 健康检查
     *
     * @return
     */
    @GetMapping("/health")
    public BaseResponse<String> health() {
        return ResultUtils.success("ok");
    }
}
