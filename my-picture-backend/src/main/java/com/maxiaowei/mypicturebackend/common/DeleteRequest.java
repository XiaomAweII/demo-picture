package com.maxiaowei.mypicturebackend.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 删除请求包装类
 * <p>
 * 作者: maxiaowei
 */
@Data
public class DeleteRequest implements Serializable {
    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}
