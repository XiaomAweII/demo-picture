package com.maxiaowei.mypicturebackend.controller;

import com.maxiaowei.mypicturebackend.annotation.AuthCheck;
import com.maxiaowei.mypicturebackend.common.BaseResponse;
import com.maxiaowei.mypicturebackend.common.ResultUtils;
import com.maxiaowei.mypicturebackend.constant.UserConstant;
import com.maxiaowei.mypicturebackend.model.dto.picture.PictureUploadRequest;
import com.maxiaowei.mypicturebackend.model.entity.User;
import com.maxiaowei.mypicturebackend.model.vo.PictureVO;
import com.maxiaowei.mypicturebackend.service.PictureService;
import com.maxiaowei.mypicturebackend.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 功能描述:
 * <p>
 * 作者: maxiaowei
 */
@RestController
@RequestMapping("/picture")
@Slf4j
public class PictureController {

    @Resource
    private UserService userService;

    @Resource
    private PictureService pictureService;

    /**
     * 上传图片（可重新上传）
     */
    @PostMapping("/upload")
    @AuthCheck(mustRole = UserConstant.ADMIN_ROLE)
    public BaseResponse<PictureVO> uploadPicture(
            @RequestPart("file") MultipartFile multipartFile,
            PictureUploadRequest pictureUploadRequest,
            HttpServletRequest request) {
        User loginUser = userService.getLoginUser(request);
        PictureVO pictureVO = pictureService.uploadPicture(multipartFile, pictureUploadRequest, loginUser);
        return ResultUtils.success(pictureVO);
    }
}
