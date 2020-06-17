package com.realc.safe.model;

import java.io.Serializable;

public class SysLog implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column realc_sys_log.sys_id
     *
     * @mbg.generated
     */
    private String sysId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column realc_sys_log.sys_level
     *
     * @mbg.generated
     */
    private String sysLevel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column realc_sys_log.sys_position
     *
     * @mbg.generated
     */
    private String sysPosition;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column realc_sys_log.create_time
     *
     * @mbg.generated
     */
    private String createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column realc_sys_log.create_account
     *
     * @mbg.generated
     */
    private String createAccount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column realc_sys_log.create_account_name
     *
     * @mbg.generated
     */
    private String createAccountName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column realc_sys_log.merchant_id
     *
     * @mbg.generated
     */
    private Integer merchantId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column realc_sys_log.sys_ip
     *
     * @mbg.generated
     */
    private String sysIp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column realc_sys_log.sys_content
     *
     * @mbg.generated
     */
    private String sysContent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table realc_sys_log
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column realc_sys_log.sys_id
     *
     * @return the value of realc_sys_log.sys_id
     *
     * @mbg.generated
     */
    public String getSysId() {
        return sysId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column realc_sys_log.sys_id
     *
     * @param sysId the value for realc_sys_log.sys_id
     *
     * @mbg.generated
     */
    public void setSysId(String sysId) {
        this.sysId = sysId == null ? null : sysId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column realc_sys_log.sys_level
     *
     * @return the value of realc_sys_log.sys_level
     *
     * @mbg.generated
     */
    public String getSysLevel() {
        return sysLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column realc_sys_log.sys_level
     *
     * @param sysLevel the value for realc_sys_log.sys_level
     *
     * @mbg.generated
     */
    public void setSysLevel(String sysLevel) {
        this.sysLevel = sysLevel == null ? null : sysLevel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column realc_sys_log.sys_position
     *
     * @return the value of realc_sys_log.sys_position
     *
     * @mbg.generated
     */
    public String getSysPosition() {
        return sysPosition;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column realc_sys_log.sys_position
     *
     * @param sysPosition the value for realc_sys_log.sys_position
     *
     * @mbg.generated
     */
    public void setSysPosition(String sysPosition) {
        this.sysPosition = sysPosition == null ? null : sysPosition.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column realc_sys_log.create_time
     *
     * @return the value of realc_sys_log.create_time
     *
     * @mbg.generated
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column realc_sys_log.create_time
     *
     * @param createTime the value for realc_sys_log.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column realc_sys_log.create_account
     *
     * @return the value of realc_sys_log.create_account
     *
     * @mbg.generated
     */
    public String getCreateAccount() {
        return createAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column realc_sys_log.create_account
     *
     * @param createAccount the value for realc_sys_log.create_account
     *
     * @mbg.generated
     */
    public void setCreateAccount(String createAccount) {
        this.createAccount = createAccount == null ? null : createAccount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column realc_sys_log.create_account_name
     *
     * @return the value of realc_sys_log.create_account_name
     *
     * @mbg.generated
     */
    public String getCreateAccountName() {
        return createAccountName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column realc_sys_log.create_account_name
     *
     * @param createAccountName the value for realc_sys_log.create_account_name
     *
     * @mbg.generated
     */
    public void setCreateAccountName(String createAccountName) {
        this.createAccountName = createAccountName == null ? null : createAccountName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column realc_sys_log.merchant_id
     *
     * @return the value of realc_sys_log.merchant_id
     *
     * @mbg.generated
     */
    public Integer getMerchantId() {
        return merchantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column realc_sys_log.merchant_id
     *
     * @param merchantId the value for realc_sys_log.merchant_id
     *
     * @mbg.generated
     */
    public void setMerchantId(Integer merchantId) {
        this.merchantId = merchantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column realc_sys_log.sys_ip
     *
     * @return the value of realc_sys_log.sys_ip
     *
     * @mbg.generated
     */
    public String getSysIp() {
        return sysIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column realc_sys_log.sys_ip
     *
     * @param sysIp the value for realc_sys_log.sys_ip
     *
     * @mbg.generated
     */
    public void setSysIp(String sysIp) {
        this.sysIp = sysIp == null ? null : sysIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column realc_sys_log.sys_content
     *
     * @return the value of realc_sys_log.sys_content
     *
     * @mbg.generated
     */
    public String getSysContent() {
        return sysContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column realc_sys_log.sys_content
     *
     * @param sysContent the value for realc_sys_log.sys_content
     *
     * @mbg.generated
     */
    public void setSysContent(String sysContent) {
        this.sysContent = sysContent == null ? null : sysContent.trim();
    }
}