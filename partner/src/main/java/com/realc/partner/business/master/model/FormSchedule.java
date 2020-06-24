package com.realc.partner.business.master.model;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EDZ
 */
@Data
@NoArgsConstructor
public class FormSchedule {

    private Integer fsId;
    private Integer formId;
    private String processId;
    private String processName;
    private String processSchedule;
    private String note;
    private String isValid;
    private String createTime;
    private String updateTime;

}
