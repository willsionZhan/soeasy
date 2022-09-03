package com.gene.soeasy.entity;

import java.util.List;

public class Menu {


    private Integer sortID;

    private String url;

    public Integer getSortID() {
        return sortID;
    }

    public void setSortID(Integer sortID) {
        this.sortID = sortID;
    }

    private Integer divider;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getDivider() {
        return divider;
    }

    public void setDivider(Integer divider) {
        this.divider = divider;
    }

    private List<Menu> menuList;

    public List<Menu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<Menu> menuList) {
        this.menuList = menuList;
    }

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_menu.menuID
     *
     * @mbg.generated Mon Aug 29 17:17:09 CST 2022
     */
    private Integer menuid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_menu.menuName
     *
     * @mbg.generated Mon Aug 29 17:17:09 CST 2022
     */
    private String menuname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_menu.menuPID
     *
     * @mbg.generated Mon Aug 29 17:17:09 CST 2022
     */
    private Integer menupid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_menu.menuDesc
     *
     * @mbg.generated Mon Aug 29 17:17:09 CST 2022
     */
    private String menudesc;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu
     *
     * @mbg.generated Mon Aug 29 17:17:09 CST 2022
     */
    public Menu(Integer menuid, String menuname, Integer menupid, String menudesc) {
        this.menuid = menuid;
        this.menuname = menuname;
        this.menupid = menupid;
        this.menudesc = menudesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu
     *
     * @mbg.generated Mon Aug 29 17:17:09 CST 2022
     */
    public Menu() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.menuID
     *
     * @return the value of sys_menu.menuID
     *
     * @mbg.generated Mon Aug 29 17:17:09 CST 2022
     */
    public Integer getMenuid() {
        return menuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.menuID
     *
     * @param menuid the value for sys_menu.menuID
     *
     * @mbg.generated Mon Aug 29 17:17:09 CST 2022
     */
    public void setMenuid(Integer menuid) {
        this.menuid = menuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.menuName
     *
     * @return the value of sys_menu.menuName
     *
     * @mbg.generated Mon Aug 29 17:17:09 CST 2022
     */
    public String getMenuname() {
        return menuname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.menuName
     *
     * @param menuname the value for sys_menu.menuName
     *
     * @mbg.generated Mon Aug 29 17:17:09 CST 2022
     */
    public void setMenuname(String menuname) {
        this.menuname = menuname == null ? null : menuname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.menuPID
     *
     * @return the value of sys_menu.menuPID
     *
     * @mbg.generated Mon Aug 29 17:17:09 CST 2022
     */
    public Integer getMenupid() {
        return menupid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.menuPID
     *
     * @param menupid the value for sys_menu.menuPID
     *
     * @mbg.generated Mon Aug 29 17:17:09 CST 2022
     */
    public void setMenupid(Integer menupid) {
        this.menupid = menupid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.menuDesc
     *
     * @return the value of sys_menu.menuDesc
     *
     * @mbg.generated Mon Aug 29 17:17:09 CST 2022
     */
    public String getMenudesc() {
        return menudesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.menuDesc
     *
     * @param menudesc the value for sys_menu.menuDesc
     *
     * @mbg.generated Mon Aug 29 17:17:09 CST 2022
     */
    public void setMenudesc(String menudesc) {
        this.menudesc = menudesc == null ? null : menudesc.trim();
    }
}