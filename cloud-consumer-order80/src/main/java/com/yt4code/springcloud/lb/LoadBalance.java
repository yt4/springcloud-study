package com.yt4code.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author yt
 * @date 2020/4/2 17:02
 * 功能说明
 */
public interface LoadBalance {
    /**
     * 从所有可用的server中返回一个server响应本次请求
     * @param serviceInstances
     * @return
     */
    ServiceInstance instance(List<ServiceInstance> serviceInstances);
}
