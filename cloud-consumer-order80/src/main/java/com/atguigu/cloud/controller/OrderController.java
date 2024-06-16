package com.atguigu.cloud.controller;

import com.atguigu.cloud.entities.PayDTO;
import com.atguigu.cloud.resp.ResultData;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * OrderController
 *
 * @author nhh
 */
@RestController
@RequestMapping("/consumer")
public class OrderController {

    public static final String PaymentSrv_URL="http://localhost:8001";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/pay/add")
    public ResultData addOrder(PayDTO payDTO) {
        return restTemplate.postForObject(PaymentSrv_URL+"/pay/add", payDTO, ResultData.class);
    }
}
