package com.realc.partner.business.master.service;

import com.realc.partner.business.master.model.RequestEntity;
import com.realc.partner.framework.response.ResponseResult;
import com.realc.partner.business.master.model.Form;

public interface FormService {
    ResponseResult submitForm(RequestEntity form);

    ResponseResult updateFormStatus(RequestEntity form);

    ResponseResult getFormListByStatus(RequestEntity form);

    ResponseResult formDispatcher(RequestEntity requestEntity);

    ResponseResult submitFormSchedule(RequestEntity requestEntity);

    ResponseResult submitFormEvaluate(RequestEntity requestEntity);

    ResponseResult getFormDetailByFormId(RequestEntity requestEntity);
}
