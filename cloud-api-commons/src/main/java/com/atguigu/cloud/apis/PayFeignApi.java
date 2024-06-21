package com.atguigu.cloud.apis;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author nhh
 */
@FeignClient(value = "cloud-payment-service")
public interface PayFeignApi {
}
