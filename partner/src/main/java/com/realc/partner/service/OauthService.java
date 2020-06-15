package com.realc.partner.service;

import com.realc.partner.service.impl.OauthServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author lke-bai
 * @date 2020/6/13 17:12
 * @company realc·china
 */
@FeignClient(value = "safe",fallback = OauthServiceFallback.class)
public interface OauthService {

    @GetMapping(value = "init")
    List initRedis();

}
