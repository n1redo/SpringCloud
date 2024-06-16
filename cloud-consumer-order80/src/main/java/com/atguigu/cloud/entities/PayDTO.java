package com.atguigu.cloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * PayDTO
 *
 * @author nhh
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PayDTO implements Serializable {
    private static final long serialVersionUID = -4258456768757248931L;
    private Integer id;
    // 支付流水号
    private String payNo;
    // 订单流水号
    private String orderNo;
    // 用户账号ID
    private Integer userId;
    // 交易金额
    private BigDecimal amount;
}
