package com.atguigu.cloud.resp;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 统一返回体
 *
 * @author nhh
 */
@Data
@Accessors(chain = true)
public class ResultData<T> implements Serializable {

    private static final long serialVersionUID = 5961287791275564363L;

    /**
     * 统一响应代码
     */
    private String code;

    /**
     * 统一响应信息
     */
    private String message;

    /**
     * 数据
     */
    private T data;

    /**
     * 接口调用时间
     */
    private long timestamp;

    public ResultData() {
        this.timestamp = System.currentTimeMillis();
    }

    public static <T> ResultData<T> success(T data) {
        ResultData resultData = new ResultData();
        resultData.setCode(ReturnCodeEnum.RC200.getCode());
        resultData.setMessage(ReturnCodeEnum.RC200.getMessage());
        resultData.setData(data);
        return resultData;
    }

    public static <T> ResultData<T> fail(String code, String message) {
        ResultData resultData = new ResultData();
        resultData.setCode(code);
        resultData.setMessage(message);
        return resultData;
    }
}
