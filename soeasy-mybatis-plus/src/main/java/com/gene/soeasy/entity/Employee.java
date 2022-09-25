package com.gene.soeasy.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * <p>
 * 员工表
 * </p>
 *
 * @author gene
 * @since 2022-09-25
 */
@Data
@TableName("hr_employee")
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String mobileNumber;

    private String empFullName;

    private String empFirstName;

    private String empLastName;

    private String iDCard;

    private String empPWD;

    private String wechatIDCode;

    private String personalEmail;

    private String officeEmail;

    private Integer currCompanyID;

    private Integer currDeptID;

    private Integer currPositionLevelID;

    private Integer empStatus;

    private Integer workingHours;

    private LocalDate groupHiredDate;

    private LocalDate hiredDate;

    private LocalDate probationEndDate;

    private String empType;
}
