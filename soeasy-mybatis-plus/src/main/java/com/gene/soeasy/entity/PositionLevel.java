package com.gene.soeasy.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 职位职级对应表
 * </p>
 *
 * @author gene
 * @since 2022-09-25
 */
@Data
@TableName("hr_position_level")
public class PositionLevel implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer positionID;

    private Integer levelID;

}
