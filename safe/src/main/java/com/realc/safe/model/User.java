package com.realc.safe.model;

import java.io.Serializable;

public class User implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column realc_user.mobile
     *
     * @mbg.generated
     */
    private String mobile;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column realc_user.im_pwd
     *
     * @mbg.generated
     */
    private String imPwd;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column realc_user.user_name
     *
     * @mbg.generated
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column realc_user.create_time
     *
     * @mbg.generated
     */
    private String createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column realc_user.head_url
     *
     * @mbg.generated
     */
    private String headUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column realc_user.im_account
     *
     * @mbg.generated
     */
    private String imAccount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table realc_user
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column realc_user.mobile
     *
     * @return the value of realc_user.mobile
     *
     * @mbg.generated
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column realc_user.mobile
     *
     * @param mobile the value for realc_user.mobile
     *
     * @mbg.generated
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column realc_user.im_pwd
     *
     * @return the value of realc_user.im_pwd
     *
     * @mbg.generated
     */
    public String getImPwd() {
        return imPwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column realc_user.im_pwd
     *
     * @param imPwd the value for realc_user.im_pwd
     *
     * @mbg.generated
     */
    public void setImPwd(String imPwd) {
        this.imPwd = imPwd == null ? null : imPwd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column realc_user.user_name
     *
     * @return the value of realc_user.user_name
     *
     * @mbg.generated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column realc_user.user_name
     *
     * @param userName the value for realc_user.user_name
     *
     * @mbg.generated
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column realc_user.create_time
     *
     * @return the value of realc_user.create_time
     *
     * @mbg.generated
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column realc_user.create_time
     *
     * @param createTime the value for realc_user.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column realc_user.head_url
     *
     * @return the value of realc_user.head_url
     *
     * @mbg.generated
     */
    public String getHeadUrl() {
        return headUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column realc_user.head_url
     *
     * @param headUrl the value for realc_user.head_url
     *
     * @mbg.generated
     */
    public void setHeadUrl(String headUrl) {
        this.headUrl = headUrl == null ? null : headUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column realc_user.im_account
     *
     * @return the value of realc_user.im_account
     *
     * @mbg.generated
     */
    public String getImAccount() {
        return imAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column realc_user.im_account
     *
     * @param imAccount the value for realc_user.im_account
     *
     * @mbg.generated
     */
    public void setImAccount(String imAccount) {
        this.imAccount = imAccount == null ? null : imAccount.trim();
    }
}