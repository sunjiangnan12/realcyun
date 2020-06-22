package com.realc.safe.util;

import java.util.concurrent.TimeUnit;

/**
 * <company> 上海瑞而克信息科技有限公司
 *
 * @author lke-bai
 * @date 2020/6/22 11:19
 * <description>
 */
public abstract class Status {
    /**
     * 过期时间相关枚举
     */
    public static enum ExpireEnum{
        //未读消息的有效期为30天
        UNREAD_MSG(30L, TimeUnit.DAYS)
        ;

        /**
         * 过期时间
         */
        private Long time;
        /**
         * 时间单位
         */
        private TimeUnit timeUnit;

        ExpireEnum(Long time, TimeUnit timeUnit) {
            this.time = time;
            this.timeUnit = timeUnit;
        }

        public Long getTime() {
            return time;
        }

        public TimeUnit getTimeUnit() {
            return timeUnit;
        }
    }
}
