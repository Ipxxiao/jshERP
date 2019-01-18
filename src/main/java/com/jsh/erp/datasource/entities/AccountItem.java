package com.jsh.erp.datasource.entities;

import java.math.BigDecimal;

public class AccountItem {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_accountitem.Id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_accountitem.HeaderId
     *
     * @mbggenerated
     */
    private Long headerid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_accountitem.AccountId
     *
     * @mbggenerated
     */
    private Long accountid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_accountitem.InOutItemId
     *
     * @mbggenerated
     */
    private Long inoutitemid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_accountitem.EachAmount
     *
     * @mbggenerated
     */
    private BigDecimal eachamount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_accountitem.Remark
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_accountitem.Id
     *
     * @return the value of jsh_accountitem.Id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_accountitem.Id
     *
     * @param id the value for jsh_accountitem.Id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_accountitem.HeaderId
     *
     * @return the value of jsh_accountitem.HeaderId
     *
     * @mbggenerated
     */
    public Long getHeaderid() {
        return headerid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_accountitem.HeaderId
     *
     * @param headerid the value for jsh_accountitem.HeaderId
     *
     * @mbggenerated
     */
    public void setHeaderid(Long headerid) {
        this.headerid = headerid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_accountitem.AccountId
     *
     * @return the value of jsh_accountitem.AccountId
     *
     * @mbggenerated
     */
    public Long getAccountid() {
        return accountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_accountitem.AccountId
     *
     * @param accountid the value for jsh_accountitem.AccountId
     *
     * @mbggenerated
     */
    public void setAccountid(Long accountid) {
        this.accountid = accountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_accountitem.InOutItemId
     *
     * @return the value of jsh_accountitem.InOutItemId
     *
     * @mbggenerated
     */
    public Long getInoutitemid() {
        return inoutitemid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_accountitem.InOutItemId
     *
     * @param inoutitemid the value for jsh_accountitem.InOutItemId
     *
     * @mbggenerated
     */
    public void setInoutitemid(Long inoutitemid) {
        this.inoutitemid = inoutitemid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_accountitem.EachAmount
     *
     * @return the value of jsh_accountitem.EachAmount
     *
     * @mbggenerated
     */
    public BigDecimal getEachamount() {
        return eachamount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_accountitem.EachAmount
     *
     * @param eachamount the value for jsh_accountitem.EachAmount
     *
     * @mbggenerated
     */
    public void setEachamount(BigDecimal eachamount) {
        this.eachamount = eachamount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_accountitem.Remark
     *
     * @return the value of jsh_accountitem.Remark
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_accountitem.Remark
     *
     * @param remark the value for jsh_accountitem.Remark
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}