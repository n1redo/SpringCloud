package com.atguigu.cloud.controller;

import com.atguigu.cloud.entities.Pay;
import com.atguigu.cloud.entities.PayDTO;
import com.atguigu.cloud.service.PayService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * PayController
 *
 * @author nhh
 */
@RestController
@Slf4j
@RequestMapping("/pay")
public class PayController {
    @Resource
    private PayService payService;

    @PostMapping("/add")
    public String addPay(@RequestBody Pay pay) {
        int add = payService.add(pay);
        return "成功插入记录,返回值" + add;
    }

    @DeleteMapping("/del/{id}")
    public Integer deletePay(@PathVariable("id") Integer id) {
        return payService.delete(id);
    }

    @PutMapping("/update")
    public String updatePay(@RequestBody PayDTO payDTO) {
        Pay pay = new Pay();
        BeanUtils.copyProperties(payDTO, pay);
        int update = payService.update(pay);
        return "成功修改记录,返回值" + update;
    }

    @GetMapping("/get/{id}")
    public Pay getById(@PathVariable("id") Integer id) {
        return payService.getById(id);
    }

    @PostMapping("/getAll")
    public List<Pay> getAll() {
        return payService.getAll();
    }
}
