package com.gene.soeasy.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author gene
 * @since 2022-09-25
 */
@Data
@TableName("hr_position")
public class Position implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "positionID", type = IdType.AUTO)
    private Integer positionID;

    private Integer positionPID;

    private String positionCode;

    private String positionName;

    private String positionDesc;

    private String jobDetail;

}
