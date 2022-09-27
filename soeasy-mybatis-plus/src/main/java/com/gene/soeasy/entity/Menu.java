package com.gene.soeasy.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 菜单(权限)
 * </p>
 *
 * @author gene
 * @since 2022-09-25
 */
@Data
@TableName("sys_menu")
public class Menu implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "menuID", type = IdType.AUTO)
    private Integer menuID;

    private String menuName;

    private String url;

    private Integer menuPID;

    private String menuDesc;

    private Integer divider;

    private Integer sortID;

    @TableField(exist = false)
    private List<Menu> menuList;

}
