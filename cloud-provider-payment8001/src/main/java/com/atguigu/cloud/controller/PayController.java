package com.atguigu.cloud.controller;

import com.atguigu.cloud.entities.Pay;
import com.atguigu.cloud.entities.PayDTO;
import com.atguigu.cloud.service.PayService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
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
@Tag(name = "支付微服务模块",description = "支付CRUD")
public class PayController {
    @Resource
    private PayService payService;

    @PostMapping("/add")
    @Operation(summary = "新增",description = "新增支付流水方法,json串做参数")
    public String addPay(@RequestBody Pay pay) {
        int add = payService.add(pay);
        return "成功插入记录,返回值" + add;
    }

    @DeleteMapping("/del/{id}")
    @Operation(summary = "删除",description = "删除支付流水方法")
    public Integer deletePay(@PathVariable("id") Integer id) {
        return payService.delete(id);
    }

    @PutMapping("/update")
    @Operation(summary = "修改",description = "修改支付流水方法")
    public String updatePay(@RequestBody PayDTO payDTO) {
        Pay pay = new Pay();
        BeanUtils.copyProperties(payDTO, pay);
        int update = payService.update(pay);
        return "成功修改记录,返回值" + update;
    }

    @GetMapping("/get/{id}")
    @Operation(summary = "按照ID查流水",description = "查询支付流水方法")
    public Pay getById(@PathVariable("id") Integer id) {
        return payService.getById(id);
    }

    @PostMapping("/getAll")
    @Operation(summary = "查询",description = "查询所有支付流水方法")
    public List<Pay> getAll() {
        return payService.getAll();
    }
}
