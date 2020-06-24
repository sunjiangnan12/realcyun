package com.realc.partner.business.master.mapper;

import com.realc.partner.business.master.model.Form;
import com.realc.partner.business.master.model.RequestEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FormMapper {

    Long getCount();

    /**
     * 创建报单
     * @param form
     * @return
     */
    Long createForm(RequestEntity form);

    /**
     * 修改报单
     * @param form
     * @return
     */
    Long updateForm(RequestEntity form);

    /**
     * 获取分页总数
     * @param form
     * @return
     */
    Long getFormCountByCondition(RequestEntity form);

    /**
     * 获取分页数据
     * @param form
     * @return
     */
    List<Form> getFormListByCondition(RequestEntity form);

    /**
     * 派单
     * @param requestEntity
     * @return
     */
    Long createFormDispatcher(RequestEntity requestEntity);

    /**
     * 评价
     * @param requestEntity
     * @return
     */
    Long submitFormEvaluate(RequestEntity requestEntity);

    /**
     * 进度登记
     * @param requestEntity
     * @return
     */
    Long createFormSchedule(RequestEntity requestEntity);

    /**
     * 获取报单详情
     * @param requestEntity
     * @return
     */
    List<Form> getFormDetailByFormId(RequestEntity requestEntity);

    /**
     * 获取失效派单id
     * @param date
     * @return
     */
    List<Integer> getOverdueDispatcherFormIds(@Param("date") String date);

    /**
     * 修改报单
     * @param ids
     * @param date
     */
    void updateFormByFormIds(@Param("ids") List<Integer> ids, @Param("date") String date);

    /**
     * 已有的派单失效
     * @param ids
     * @param date
     */
    void updateFormDispatcher(@Param("ids") List<Integer> ids, @Param("date") String date);
}
