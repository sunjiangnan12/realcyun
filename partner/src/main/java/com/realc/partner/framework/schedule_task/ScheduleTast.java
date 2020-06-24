package com.realc.partner.framework.schedule_task;

import com.realc.partner.business.master.mapper.FormMapper;
import com.realc.partner.framework.exception.CommonException;
import com.realc.partner.framework.util.DateUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Component
public class ScheduleTast {

    @Resource
    private FormMapper formMapper;


    /**
     *  定时派单
     */
//    @Scheduled(cron = "0 0/5 * * * ?")
        @Scheduled(fixedDelay = 1000 * 60 * 60)
    @Transactional(rollbackFor = Exception.class)
    public void formDispatcher(){
        log.info("定时派单....");
        // 获取需要进行派单的报单id
        List<Integer> ids = formMapper.getOverdueDispatcherFormIds(DateUtil.getNow());

        if (ids.size() > 0) {
            // 修改报单状态为已确认
            formMapper.updateFormByFormIds(ids, DateUtil.getNow());
            // 已派单失效
            formMapper.updateFormDispatcher(ids, DateUtil.getNow());
        }
        log.info("定时派单结束。");
    }
}
