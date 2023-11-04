package com.manong.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;


@Getter
@Setter
@Accessors(chain = true)
@TableName("sys_permission")
public class PermissionEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 权限编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 权限名称
     */
    @TableField("label")
    private String label;

    /**
     * 父权限ID
     */
    @TableField("parent_id")
    private Long parentId;

    /**
     * 父权限名称
     */
    @TableField("parent_name")
    private String parentName;

    /**
     * 授权标识符
     */
    @TableField("code")
    private String code;

    /**
     * 路由地址
     */
    @TableField("path")
    private String path;

    /**
     * 路由名称
     */
    @TableField("name")
    private String name;

    /**
     * 授权路径
     */
    @TableField("url")
    private String url;

    /**
     * 权限类型(0-目录，1-文件)
     */
    @TableField("type")
    private Integer type;

    /**
     * 图标
     */
    @TableField("icon")
    private String icon;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;

    /**
     * 修改时间
     */
    @TableField("update_time")
    private Date updateTime;

    /**
     * 备注
     */
    @TableField("remark")
    private String remark;

    /**
     * 排序
     */
    @TableField("order_num")
    private Integer orderNum;

    /**
     * 是否删除
     */
    @TableField("is_delete")
    private Integer isDelete;


}
