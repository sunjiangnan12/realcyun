package com.realc.safe.model;

import java.io.Serializable;

public class LevelUser implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column realc_level_user.level_user_id
     *
     * @mbg.generated
     */
    private String levelUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column realc_level_user.level_user_value
     *
     * @mbg.generated
     */
    private Integer levelUserValue;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column realc_level_user.level_user_name
     *
     * @mbg.generated
     */
    private String levelUserName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column realc_level_user.create_time
     *
     * @mbg.generated
     */
    private String createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column realc_level_user.level_user_points
     *
     * @mbg.generated
     */
    private Integer levelUserPoints;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column realc_level_user.level_user_percent
     *
     * @mbg.generated
     */
    private Byte levelUserPercent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table realc_level_user
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column realc_level_user.level_user_id
     *
     * @return the value of realc_level_user.level_user_id
     *
     * @mbg.generated
     */
    public String getLevelUserId() {
        return levelUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column realc_level_user.level_user_id
     *
     * @param levelUserId the value for realc_level_user.level_user_id
     *
     * @mbg.generated
     */
    public void setLevelUserId(String levelUserId) {
        this.levelUserId = levelUserId == null ? null : levelUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column realc_level_user.level_user_value
     *
     * @return the value of realc_level_user.level_user_value
     *
     * @mbg.generated
     */
    public Integer getLevelUserValue() {
        return levelUserValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column realc_level_user.level_user_value
     *
     * @param levelUserValue the value for realc_level_user.level_user_value
     *
     * @mbg.generated
     */
    public void setLevelUserValue(Integer levelUserValue) {
        this.levelUserValue = levelUserValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column realc_level_user.level_user_name
     *
     * @return the value of realc_level_user.level_user_name
     *
     * @mbg.generated
     */
    public String getLevelUserName() {
        return levelUserName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column realc_level_user.level_user_name
     *
     * @param levelUserName the value for realc_level_user.level_user_name
     *
     * @mbg.generated
     */
    public void setLevelUserName(String levelUserName) {
        this.levelUserName = levelUserName == null ? null : levelUserName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column realc_level_user.create_time
     *
     * @return the value of realc_level_user.create_time
     *
     * @mbg.generated
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column realc_level_user.create_time
     *
     * @param createTime the value for realc_level_user.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column realc_level_user.level_user_points
     *
     * @return the value of realc_level_user.level_user_points
     *
     * @mbg.generated
     */
    public Integer getLevelUserPoints() {
        return levelUserPoints;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column realc_level_user.level_user_points
     *
     * @param levelUserPoints the value for realc_level_user.level_user_points
     *
     * @mbg.generated
     */
    public void setLevelUserPoints(Integer levelUserPoints) {
        this.levelUserPoints = levelUserPoints;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column realc_level_user.level_user_percent
     *
     * @return the value of realc_level_user.level_user_percent
     *
     * @mbg.generated
     */
    public Byte getLevelUserPercent() {
        return levelUserPercent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column realc_level_user.level_user_percent
     *
     * @param levelUserPercent the value for realc_level_user.level_user_percent
     *
     * @mbg.generated
     */
    public void setLevelUserPercent(Byte levelUserPercent) {
        this.levelUserPercent = levelUserPercent;
    }
}