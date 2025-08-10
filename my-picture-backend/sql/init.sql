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