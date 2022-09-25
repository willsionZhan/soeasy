package com.gene.soeasy.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 公司架构表
 * </p>
 *
 * @author gene
 * @since 2022-09-25
 */
@Data
@TableName("org_company")
public class Company implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "companyID", type = IdType.AUTO)
    private Integer companyID;

    private Integer companyPID;

    private String companyName;

    private String companyCode;

    private String companyDESC;

    private Boolean isGroup;


}
