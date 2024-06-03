package com.atguigu.cloud.entities;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * PayDTO
 *
 * @author nhh
 */
public class PayDTO implements Serializable {
    private static final long serialVersionUID = -7012338017994539589L;
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
