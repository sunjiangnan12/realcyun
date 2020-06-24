package com.realc.partner.business.master.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author EDZ
 */
@Data
@NoArgsConstructor
public class Form {

    private Integer formId;
    private String userName;
    private String formUserId;
    private String formUserName;
    private String formUserTel;
    private String shopId;
    private String shopName;
    private String shopTel;
    private String formType;
    private String clientId;
    private String clientName;
    private String clientTel;
    private String clientWx;
    private String clientAddr;
    private String clientIsContact;
    private String clientDescribe;
    private String linkUp;
    private BigDecimal gatheringDetail;
    private BigDecimal payment;
    private BigDecimal serviceChargeCount;
    private BigDecimal serviceCharge;
    private String createTime;
    private String updateTime;
    private String isValid;
    // 报单状态（0发起/1审核中/2确认中/3已确认/4派单中/5接单/6完结）
    private String formStatus;
    private String isFake;

    private List<FormEvaluate> evaluates;
    private List<FormSchedule> schedules;

}
