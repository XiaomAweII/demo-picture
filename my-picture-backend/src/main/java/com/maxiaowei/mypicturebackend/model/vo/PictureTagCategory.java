package com.maxiaowei.mypicturebackend.model.vo;

import lombok.Data;

import java.util.List;

/**
 * 图片标签分类列表视图
 * <p>
 * 作者: maxiaowei
 */
@Data
public class PictureTagCategory {
    /**
     * 标签列表
     */
    private List<String> tagList;

    /**
     * 分类列表
     */
    private List<String> categoryList;
}
