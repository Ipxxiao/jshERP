package com.jsh.erp.datasource.entities;

import java.math.BigDecimal;

public class Account {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_account.Id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_account.Name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_account.SerialNo
     *
     * @mbggenerated
     */
    private String serialno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_account.InitialAmount
     *
     * @mbggenerated
     */
    private BigDecimal initialamount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_account.CurrentAmount
     *
     * @mbggenerated
     */
    private BigDecimal currentamount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_account.Remark
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_account.IsDefault
     *
     * @mbggenerated
     */
    private Boolean isdefault;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_account.Id
     *
     * @return the value of jsh_account.Id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_account.Id
     *
     * @param id the value for jsh_account.Id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_account.Name
     *
     * @return the value of jsh_account.Name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_account.Name
     *
     * @param name the value for jsh_account.Name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_account.SerialNo
     *
     * @return the value of jsh_account.SerialNo
     *
     * @mbggenerated
     */
    public String getSerialno() {
        return serialno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_account.SerialNo
     *
     * @param serialno the value for jsh_account.SerialNo
     *
     * @mbggenerated
     */
    public void setSerialno(String serialno) {
        this.serialno = serialno == null ? null : serialno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_account.InitialAmount
     *
     * @return the value of jsh_account.InitialAmount
     *
     * @mbggenerated
     */
    public BigDecimal getInitialamount() {
        return initialamount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_account.InitialAmount
     *
     * @param initialamount the value for jsh_account.InitialAmount
     *
     * @mbggenerated
     */
    public void setInitialamount(BigDecimal initialamount) {
        this.initialamount = initialamount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_account.CurrentAmount
     *
     * @return the value of jsh_account.CurrentAmount
     *
     * @mbggenerated
     */
    public BigDecimal getCurrentamount() {
        return currentamount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_account.CurrentAmount
     *
     * @param currentamount the value for jsh_account.CurrentAmount
     *
     * @mbggenerated
     */
    public void setCurrentamount(BigDecimal currentamount) {
        this.currentamount = currentamount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_account.Remark
     *
     * @return the value of jsh_account.Remark
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_account.Remark
     *
     * @param remark the value for jsh_account.Remark
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_account.IsDefault
     *
     * @return the value of jsh_account.IsDefault
     *
     * @mbggenerated
     */
    public Boolean getIsdefault() {
        return isdefault;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_account.IsDefault
     *
     * @param isdefault the value for jsh_account.IsDefault
     *
     * @mbggenerated
     */
    public void setIsdefault(Boolean isdefault) {
        this.isdefault = isdefault;
    }
}