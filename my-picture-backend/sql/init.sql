-- 用户表
CREATE TABLE IF NOT EXISTS user
(
    id           bigint auto_increment comment 'id' primary key,
    userAccount  varchar(191)                           not null comment '账号',  -- 从256改为191
    userPassword varchar(512)                           not null comment '密码',
    userName     varchar(191)                           null comment '用户昵称', -- 从256改为191
    userAvatar   varchar(1024)                          null comment '用户头像',
    userProfile  varchar(512)                           null comment '用户简介',
    userRole     varchar(256) default 'user'            not null comment '用户角色：user/admin',
    editTime     datetime     default CURRENT_TIMESTAMP not null comment '编辑时间',
    createTime   datetime     default CURRENT_TIMESTAMP not null comment '创建时间',
    updateTime   datetime     default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    isDelete     tinyint      default 0                 not null comment '是否删除',
    vipExpireTime datetime     null comment '会员过期时间',
    vipCode       varchar(128) null comment '会员兑换码',
    vipNumber     bigint       null comment '会员编号',
    UNIQUE KEY uk_userAccount (userAccount),  -- 现在安全了(191×4=764 < 1000)
    INDEX idx_userName (userName)             -- 现在安全了(191×4=764 < 1000)
) comment '用户' collate = utf8mb4_unicode_ci;

-- 图片表
CREATE TABLE IF NOT EXISTS picture
(
    id           bigint auto_increment comment 'id' primary key,
    url          varchar(512)                       not null comment '图片 url',
    name         varchar(128)                       not null comment '图片名称',
    introduction varchar(512)                       null comment '简介',
    category     varchar(64)                        null comment '分类',
    tags         varchar(512)                       null comment '标签（JSON 数组）',
    picSize      bigint                             null comment '图片体积',
    picWidth     int                                null comment '图片宽度',
    picHeight    int                                null comment '图片高度',
    picScale     double                             null comment '图片宽高比例',
    picFormat    varchar(32)                        null comment '图片格式',
    userId       bigint                             not null comment '创建用户 id',
    createTime   datetime default CURRENT_TIMESTAMP not null comment '创建时间',
    editTime     datetime default CURRENT_TIMESTAMP not null comment '编辑时间',
    updateTime   datetime default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    isDelete     tinyint  default 0                 not null comment '是否删除',
    INDEX idx_name (name),
    INDEX idx_introduction (introduction(191)),  -- 添加前缀限制
    INDEX idx_category (category),
    -- 移除对tags的直接索引，建议使用单独的关系表
    INDEX idx_userId (userId),
    INDEX idx_createTime (createTime)  -- 新增：常用于排序和查询最新图片
) comment '图片' collate = utf8mb4_unicode_ci;