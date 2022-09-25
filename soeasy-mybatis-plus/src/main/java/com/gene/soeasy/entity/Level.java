package com.gene.soeasy.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 职级表
 * </p>
 *
 * @author gene
 * @since 2022-09-25
 */
@Data
@TableName("hr_level")
public class Level implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "levelID", type = IdType.AUTO)
    private Integer levelID;

    private Integer levelPID;

    private String levelCode;

    private String levelName;

    private String levelDesc;

}
