package com.cky;

import lombok.Data;

import java.io.Serializable;

/**
 * @author wales
 * <p>
 * Result 公共封装
 * </p>
 */
@Data
public class Result implements Serializable {

    /**
     * 状态： True False
     */
    private boolean flag;

    /**
     * 消息： 具体消息
     */
    private String msg;

    /**
     * 数据： 任何类型
     */
    private Object data;
}
