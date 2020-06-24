package com.realc.partner.business.master.model;

/**
 * @author EDZ
 */
public class FormEvaluate {
    private Integer feId;
    private Integer formId;
    private String evaUserId;
    private String evaUserName;
    private String evaluate;
    private String note;
    private String isValid;
    private String createTime;
    private String updateTime;

    public FormEvaluate() {
    }

    public FormEvaluate(Integer feId, Integer formId, String evaUserId, String evaUserName, String evaluate, String note, String isValid, String createTime, String updateTime) {
        this.feId = feId;
        this.formId = formId;
        this.evaUserId = evaUserId;
        this.evaUserName = evaUserName;
        this.evaluate = evaluate;
        this.note = note;
        this.isValid = isValid;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Integer getFeId() {
        return feId;
    }

    public void setFeId(Integer feId) {
        this.feId = feId;
    }

    public Integer getFormId() {
        return formId;
    }

    public void setFormId(Integer formId) {
        this.formId = formId;
    }

    public String getEvaUserId() {
        return evaUserId;
    }

    public void setEvaUserId(String evaUserId) {
        this.evaUserId = evaUserId;
    }

    public String getEvaUserName() {
        return evaUserName;
    }

    public void setEvaUserName(String evaUserName) {
        this.evaUserName = evaUserName;
    }

    public String getEvaluate() {
        return evaluate;
    }

    public void setEvaluate(String evaluate) {
        this.evaluate = evaluate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getIsValid() {
        return isValid;
    }

    public void setIsValid(String isValid) {
        this.isValid = isValid;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "FormEvaluate{" +
                "feId=" + feId +
                ", formId=" + formId +
                ", evaUserId='" + evaUserId + '\'' +
                ", evaUserName='" + evaUserName + '\'' +
                ", evaluate='" + evaluate + '\'' +
                ", note='" + note + '\'' +
                ", isValid='" + isValid + '\'' +
                ", createTime='" + createTime + '\'' +
                ", updateTime='" + updateTime + '\'' +
                '}';
    }
}
