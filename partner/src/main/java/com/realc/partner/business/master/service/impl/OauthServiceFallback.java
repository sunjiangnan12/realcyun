package com.realc.partner.business.master.service.impl;

import com.realc.partner.business.master.service.OauthService;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @author lke-bai
 * @date 2020/6/13 17:14
 * @company realc·china
 */
@Component
public class OauthServiceFallback implements OauthService {


    @Override
    public List initRedis() {
        return Arrays.asList("500");
    }

}
