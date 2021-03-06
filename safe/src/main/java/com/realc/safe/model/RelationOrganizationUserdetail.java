package com.realc.safe.model;

import java.io.Serializable;

public class RelationOrganizationUserdetail implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column realc_relation_organization_userdetail.relation_id
     *
     * @mbg.generated
     */
    private String relationId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column realc_relation_organization_userdetail.user_id
     *
     * @mbg.generated
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column realc_relation_organization_userdetail.organization_id
     *
     * @mbg.generated
     */
    private String organizationId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column realc_relation_organization_userdetail.merchant_id
     *
     * @mbg.generated
     */
    private Integer merchantId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column realc_relation_organization_userdetail.position
     *
     * @mbg.generated
     */
    private String position;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table realc_relation_organization_userdetail
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column realc_relation_organization_userdetail.relation_id
     *
     * @return the value of realc_relation_organization_userdetail.relation_id
     *
     * @mbg.generated
     */
    public String getRelationId() {
        return relationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column realc_relation_organization_userdetail.relation_id
     *
     * @param relationId the value for realc_relation_organization_userdetail.relation_id
     *
     * @mbg.generated
     */
    public void setRelationId(String relationId) {
        this.relationId = relationId == null ? null : relationId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column realc_relation_organization_userdetail.user_id
     *
     * @return the value of realc_relation_organization_userdetail.user_id
     *
     * @mbg.generated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column realc_relation_organization_userdetail.user_id
     *
     * @param userId the value for realc_relation_organization_userdetail.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column realc_relation_organization_userdetail.organization_id
     *
     * @return the value of realc_relation_organization_userdetail.organization_id
     *
     * @mbg.generated
     */
    public String getOrganizationId() {
        return organizationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column realc_relation_organization_userdetail.organization_id
     *
     * @param organizationId the value for realc_relation_organization_userdetail.organization_id
     *
     * @mbg.generated
     */
    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId == null ? null : organizationId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column realc_relation_organization_userdetail.merchant_id
     *
     * @return the value of realc_relation_organization_userdetail.merchant_id
     *
     * @mbg.generated
     */
    public Integer getMerchantId() {
        return merchantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column realc_relation_organization_userdetail.merchant_id
     *
     * @param merchantId the value for realc_relation_organization_userdetail.merchant_id
     *
     * @mbg.generated
     */
    public void setMerchantId(Integer merchantId) {
        this.merchantId = merchantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column realc_relation_organization_userdetail.position
     *
     * @return the value of realc_relation_organization_userdetail.position
     *
     * @mbg.generated
     */
    public String getPosition() {
        return position;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column realc_relation_organization_userdetail.position
     *
     * @param position the value for realc_relation_organization_userdetail.position
     *
     * @mbg.generated
     */
    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }
}