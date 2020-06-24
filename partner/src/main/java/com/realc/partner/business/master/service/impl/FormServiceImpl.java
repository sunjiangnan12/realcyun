package com.realc.partner.business.master.service.impl;

import com.realc.partner.business.master.model.Form;
import com.realc.partner.business.master.model.RequestEntity;
import com.realc.partner.business.master.service.FormService;
import com.realc.partner.framework.response.Page;
import com.realc.partner.framework.response.ResponseResult;
import static com.realc.partner.framework.util.DateUtil.*;
import com.realc.partner.business.master.mapper.FormMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author EDZ
 */
@Service
@Slf4j
@Transactional(rollbackFor = Exception.class)
public class FormServiceImpl implements FormService {

    @Resource
    private FormMapper formMapper;

    @Override
    public ResponseResult submitForm(RequestEntity form) {

        form.setCreateTime(getNow());
        form.setUpdateTime(getNow());

        Long result = formMapper.createForm(form);

        if (result < 1) {
            return new ResponseResult().failure("数据插入失败");
        }

        return new ResponseResult().sucess();
    }

    @Override
    public ResponseResult updateFormStatus(RequestEntity form) {

        form.setUpdateTime(getNow());
        Long result = formMapper.updateForm(form);
        if ("0".equals(form.getIsFake())) {
            log.info("虚假报单");
        }
        if (result < 1) {
            return new ResponseResult().failure("修改失败");
        }
        return new ResponseResult().sucess();
    }

    @Override
    public ResponseResult getFormListByStatus(RequestEntity form) {

        Page page = new Page();

        page.setPageSize(form.getPageSize());
        page.setPageIndex(form.getPageIndex());

        Long total = formMapper.getFormCountByCondition(form);

        page.config(total);
        form.setPageStart(page.getStart());
        List<Form> forms = formMapper.getFormListByCondition(form);
        return new ResponseResult().sucess(forms, page);
    }

    @Override
    public ResponseResult formDispatcher(RequestEntity requestEntity) {

        // 派单
        requestEntity.setCreateTime(getNow());
        requestEntity.setUpdateTime(getNow());
        Long count = formMapper.createFormDispatcher(requestEntity);
        if (count < 1) {
            return new ResponseResult().failure("派单失败");
        }
        // 修改报单状态
        requestEntity.setFormStatus("4");
        count = formMapper.updateForm(requestEntity);
        if (count < 1) {
            return new ResponseResult().failure("派单失败");
        }

        return new ResponseResult().sucess();
    }

    @Override
    public ResponseResult submitFormSchedule(RequestEntity requestEntity) {

        requestEntity.setCreateTime(getNow());
        requestEntity.setUpdateTime(getNow());

        Long count = formMapper.createFormSchedule(requestEntity);

        if (count < 1){
            return new ResponseResult().failure("数据库执行出错，提交失败");
        }
        return new ResponseResult().sucess();
    }

    @Override
    public ResponseResult submitFormEvaluate(RequestEntity requestEntity) {

        requestEntity.setUpdateTime(getNow());
        requestEntity.setCreateTime(getNow());

        Long count = formMapper.submitFormEvaluate(requestEntity);

        if (count < 1){
            return new ResponseResult().failure("数据库执行出错，提交失败");
        }
        return new ResponseResult().sucess();
    }

    @Override
    public ResponseResult getFormDetailByFormId(RequestEntity requestEntity) {

        List<Form> forms = formMapper.getFormDetailByFormId(requestEntity);

        return new ResponseResult().sucess(forms);
    }
}
