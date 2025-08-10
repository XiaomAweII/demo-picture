package com.maxiaowei.mypicturebackend.model.dto.picture;

import lombok.Data;

import java.io.Serializable;

/**
 * 图片上传请求
 * <p>
 * 作者: maxiaowei
 */
@Data
public class PictureUploadRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 图片 id（用于修改）
     */
    private Long id;
}
