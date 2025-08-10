package com.maxiaowei.mypicturebackend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.maxiaowei.mypicturebackend.model.entity.Picture;
import com.maxiaowei.mypicturebackend.service.PictureService;
import com.maxiaowei.mypicturebackend.mapper.PictureMapper;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【picture(图片)】的数据库操作Service实现
* @createDate 2025-08-10 18:48:43
*/
@Service
public class PictureServiceImpl extends ServiceImpl<PictureMapper, Picture>
    implements PictureService{

}




