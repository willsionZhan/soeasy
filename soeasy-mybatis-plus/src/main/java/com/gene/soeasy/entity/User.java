package com.gene.soeasy.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 系统用户表
 * </p>
 *
 * @author gene
 * @since 2022-09-25
 */
@Data
@TableName("sys_user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "userID", type = IdType.AUTO)
    private Integer userID;

    @TableField("userCode")
    private String userCode;

    @TableField("userName")
    private String userName;

    @TableField("userPWD")
    private String userPWD;

    @TableField("userStatus")
    private Integer userStatus;

    @TableField("logInfo")
    private String logInfo;

}
