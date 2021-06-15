package com.cky.entity;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* @author Wales-Yu
* <p>
* 实体
* @date Thu Jun 10 15:05:48 CST 2021
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MpUserInfo implements java.io.Serializable {
    /**
     * 主键ID
     */
    private String id;

    /**
     * 员工编号
     */
    private Integer userNo;

    /**
     * 员工姓名
     */
    private String name;

    /**
     * 性别
     */
    private String gender;

    /**
     * 出生日期
     */
    private Date birthday;

    /**
     * 身份证号
     */
    private String idCard;

    /**
     * 婚姻状况
     */
    private String wedlock;

    /**
     * 民族
     */
    private Integer nationId;

    /**
     * 籍贯
     */
    private String nativePlace;

    /**
     * 政治面貌
     */
    private Integer politicId;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 电话号码
     */
    private String phone;

    /**
     * 联系地址
     */
    private String address;
}