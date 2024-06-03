package com.atguigu.cloud.controller;

import com.atguigu.cloud.service.PayService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

/**
 * PayController
 *
 * @author nhh
 */
@RestController
@Slf4j
public class PayController {
    @Resource
    private PayService payService;


}
