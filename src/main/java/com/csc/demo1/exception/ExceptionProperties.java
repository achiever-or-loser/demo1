package com.csc.demo1.exception;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @program: spring-parent
 * @description: 异常处理自动化配置PO
 * @author: csc
 * @create: 2020/10/28
 */
@ConfigurationProperties(prefix = "spring.csc.exception")
public class ExceptionProperties {
    /**
     * 是否开启异常拦截
     */
    private boolean enable;

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }
}
