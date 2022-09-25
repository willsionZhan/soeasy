package com.gene.soeasy.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 公司职位表
 * </p>
 *
 * @author gene
 * @since 2022-09-25
 */
@Data
@TableName("hr_comp_position")
public class CompPosition implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer compID;

    private Integer deptID;

    private Integer positionID;

    private Integer fixedNumber;

}
