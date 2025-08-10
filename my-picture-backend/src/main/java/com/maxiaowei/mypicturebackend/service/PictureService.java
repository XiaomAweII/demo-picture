package com.maxiaowei.mypicturebackend.service;

import com.maxiaowei.mypicturebackend.model.dto.picture.PictureUploadRequest;
import com.maxiaowei.mypicturebackend.model.entity.Picture;
import com.baomidou.mybatisplus.extension.service.IService;
import com.maxiaowei.mypicturebackend.model.entity.User;
import com.maxiaowei.mypicturebackend.model.vo.PictureVO;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author Administrator
 * @description 针对表【picture(图片)】的数据库操作Service
 * @createDate 2025-08-10 18:48:43
 */
public interface PictureService extends IService<Picture> {
    /**
     * 上传图片
     *
     * @param multipartFile
     * @param pictureUploadRequest
     * @param loginUser
     * @return
     */
    PictureVO uploadPicture(MultipartFile multipartFile, PictureUploadRequest pictureUploadRequest, User loginUser);
}
