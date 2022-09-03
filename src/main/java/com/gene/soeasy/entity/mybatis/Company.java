package com.gene.soeasy.entity.mybatis;

public class Company {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column org_company.companyID
     *
     * @mbg.generated Sat Sep 03 17:26:49 CST 2022
     */
    private Integer companyid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column org_company.companyPID
     *
     * @mbg.generated Sat Sep 03 17:26:49 CST 2022
     */
    private Integer companypid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column org_company.companyName
     *
     * @mbg.generated Sat Sep 03 17:26:49 CST 2022
     */
    private String companyname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column org_company.companyCode
     *
     * @mbg.generated Sat Sep 03 17:26:49 CST 2022
     */
    private String companycode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column org_company.companyDESC
     *
     * @mbg.generated Sat Sep 03 17:26:49 CST 2022
     */
    private String companydesc;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column org_company.isGroup
     *
     * @mbg.generated Sat Sep 03 17:26:49 CST 2022
     */
    private Boolean isgroup;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table org_company
     *
     * @mbg.generated Sat Sep 03 17:26:49 CST 2022
     */
    public Company(Integer companyid, Integer companypid, String companyname, String companycode, String companydesc, Boolean isgroup) {
        this.companyid = companyid;
        this.companypid = companypid;
        this.companyname = companyname;
        this.companycode = companycode;
        this.companydesc = companydesc;
        this.isgroup = isgroup;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table org_company
     *
     * @mbg.generated Sat Sep 03 17:26:49 CST 2022
     */
    public Company() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column org_company.companyID
     *
     * @return the value of org_company.companyID
     *
     * @mbg.generated Sat Sep 03 17:26:49 CST 2022
     */
    public Integer getCompanyid() {
        return companyid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column org_company.companyID
     *
     * @param companyid the value for org_company.companyID
     *
     * @mbg.generated Sat Sep 03 17:26:49 CST 2022
     */
    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column org_company.companyPID
     *
     * @return the value of org_company.companyPID
     *
     * @mbg.generated Sat Sep 03 17:26:49 CST 2022
     */
    public Integer getCompanypid() {
        return companypid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column org_company.companyPID
     *
     * @param companypid the value for org_company.companyPID
     *
     * @mbg.generated Sat Sep 03 17:26:49 CST 2022
     */
    public void setCompanypid(Integer companypid) {
        this.companypid = companypid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column org_company.companyName
     *
     * @return the value of org_company.companyName
     *
     * @mbg.generated Sat Sep 03 17:26:49 CST 2022
     */
    public String getCompanyname() {
        return companyname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column org_company.companyName
     *
     * @param companyname the value for org_company.companyName
     *
     * @mbg.generated Sat Sep 03 17:26:49 CST 2022
     */
    public void setCompanyname(String companyname) {
        this.companyname = companyname == null ? null : companyname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column org_company.companyCode
     *
     * @return the value of org_company.companyCode
     *
     * @mbg.generated Sat Sep 03 17:26:49 CST 2022
     */
    public String getCompanycode() {
        return companycode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column org_company.companyCode
     *
     * @param companycode the value for org_company.companyCode
     *
     * @mbg.generated Sat Sep 03 17:26:49 CST 2022
     */
    public void setCompanycode(String companycode) {
        this.companycode = companycode == null ? null : companycode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column org_company.companyDESC
     *
     * @return the value of org_company.companyDESC
     *
     * @mbg.generated Sat Sep 03 17:26:49 CST 2022
     */
    public String getCompanydesc() {
        return companydesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column org_company.companyDESC
     *
     * @param companydesc the value for org_company.companyDESC
     *
     * @mbg.generated Sat Sep 03 17:26:49 CST 2022
     */
    public void setCompanydesc(String companydesc) {
        this.companydesc = companydesc == null ? null : companydesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column org_company.isGroup
     *
     * @return the value of org_company.isGroup
     *
     * @mbg.generated Sat Sep 03 17:26:49 CST 2022
     */
    public Boolean getIsgroup() {
        return isgroup;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column org_company.isGroup
     *
     * @param isgroup the value for org_company.isGroup
     *
     * @mbg.generated Sat Sep 03 17:26:49 CST 2022
     */
    public void setIsgroup(Boolean isgroup) {
        this.isgroup = isgroup;
    }
}