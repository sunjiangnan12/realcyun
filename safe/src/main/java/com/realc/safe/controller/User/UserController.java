package com.realc.safe.controller.User;

import com.realc.safe.mapper.UserDetailMapper;
import com.realc.safe.model.UserDetail;
import com.realc.safe.util.DateKit;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <company> 上海瑞而克信息科技有限公司
 *
 * @author lke-bai
 * @date 2020/6/19 16:20
 * <description>
 */
@RestController
@Slf4j
public class UserController {
    @Autowired
    private UserDetailMapper userDetailMapper;

    @PostMapping("/save")
    public Map<String, Object> save(UserDetail user) {
        Map<String, Object> result = new HashMap<String, Object>();

        DateKit.parseDateToStr(new Date(), DateKit.DATE_TIME_FORMAT_YYYY_MM_DD_HH_MI_SS);
        try {
            Integer flag = userDetailMapper.insert(user);
            if (flag > 0) {

            }
        } catch (Exception e) {
            log.error("新增用户error: " + e.getMessage());
        }

        return result;
    }

}
