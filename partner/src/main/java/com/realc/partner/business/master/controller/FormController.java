package com.realc.partner.business.master.controller;

import com.realc.partner.business.master.model.RequestEntity;
import com.realc.partner.framework.response.ResponseCode;
import com.realc.partner.framework.response.ResponseResult;
import com.realc.partner.business.master.service.FormService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping(value = "form", produces = "application/json;charset=UTF-8")
public class FormController {

    @RequestMapping(value = "test")
    public ResponseResult test() {

        ResponseResult result = new ResponseResult().sucess();
        return result;

    }

    @Resource
    private FormService formService;

    // 提交报单
    @RequestMapping(value = "submitForm", method = RequestMethod.POST)
    public ResponseResult submitForm(@RequestBody RequestEntity form) {
        return formService.submitForm(form);
    }

    // 根据状态获取报单
    @RequestMapping(value = "getFormListByStatus", method = RequestMethod.GET)
    public ResponseResult getFormListByStatus(@RequestBody RequestEntity form) {
        return formService.getFormListByStatus(form);
    }

    // 报单状态修改
    @RequestMapping(value = "updateFormStatus", method = RequestMethod.POST)
    public ResponseResult updateFormStatus(
            @RequestBody RequestEntity form
    ) {
        return formService.updateFormStatus(form);
    }

    // 派单
    @RequestMapping(value = "formDispatcher", method = RequestMethod.POST)
    public ResponseResult formDispatcher(@RequestBody RequestEntity requestEntity) {
        return formService.formDispatcher(requestEntity);
    }

    // 工作进度汇报
    @RequestMapping(value = "submitFormSchedule", method = RequestMethod.POST)
    public ResponseResult submitFormSchedule(@RequestBody RequestEntity requestEntity) {
        return formService.submitFormSchedule(requestEntity);
    }

    // 工作评价汇报.
    @RequestMapping(value = "submitFormEvaluate", method = RequestMethod.POST)
    public ResponseResult submitFormEvaluate(@RequestBody RequestEntity requestEntity) {
        return formService.submitFormEvaluate(requestEntity);
    }

    // 查看报单详情（含工作记录与评价）
    @RequestMapping(value = "getFormDetailByFormId", method = RequestMethod.POST)
    public ResponseResult getFormDetailByFormId(@RequestBody RequestEntity requestEntity) {
        return formService.getFormDetailByFormId(requestEntity);
    }
}