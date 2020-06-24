package com.realc.partner.business.master.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author EDZ
 */
@Data
@NoArgsConstructor
public class RequestEntity {

    private Integer pageSize;
    private Integer pageIndex;
    private Long pageStart;

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

    private Integer feId;
    private String evaUserId;
    private String evaUserName;
    private String evaluate;
    private String note;

    private String fromUserId;
    private String fromUserName;

    private Integer fsId;
    private String processId;
    private String processName;
    private String processSchedule;

    private Integer fdId;
    private String toUserId;
    private String toUserName;
    private String isAccept;
    private String isFake;
}
