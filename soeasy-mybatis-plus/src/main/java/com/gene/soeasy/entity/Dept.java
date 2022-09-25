package com.gene.soeasy.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 组织架构表
 * </p>
 *
 * @author gene
 * @since 2022-09-25
 */
@Data
@TableName("org_dept")
public class Dept implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "deptID", type = IdType.AUTO)
    private Integer deptID;

    private String deptName;

    private Integer deptPID;

    private Integer companyID;

    private String deptDesc;

}
