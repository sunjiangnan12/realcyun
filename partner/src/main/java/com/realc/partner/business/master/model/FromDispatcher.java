package com.realc.partner.business.master.model;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EDZ
 */
@Data
@NoArgsConstructor
public class FromDispatcher {

    private Integer fdId;
    private Integer formId;
    private String toUserId;
    private String toUserName;
    private String fromUserId;
    private String fromUserName;
    private String isAccept;
    private String isValid;
    private String createTime;
    private String updateTime;

}
