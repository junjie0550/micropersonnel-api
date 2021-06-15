package com.cky.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* @author DESKTOP-E357TIF
* <p>
* 实体
* @date Thu Jun 10 20:56:58 CST 2021
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MpPicture implements java.io.Serializable {
    /**
     * 主键ID
     */
    private String id;

    /**
     * 员工编号
     */
    private Integer pId;

    /**
     * 图片
     */
    private String picture;
}