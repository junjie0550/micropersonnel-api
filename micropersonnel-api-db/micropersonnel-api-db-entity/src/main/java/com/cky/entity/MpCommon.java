package com.cky.entity;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* @author DESKTOP-E357TIF
* <p>
* 实体
* @date Thu Jun 10 20:47:25 CST 2021
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MpCommon implements java.io.Serializable {
    /**
     * 主键ID
     */
    private String id;

    /**
     * 员工编号
     */
    private Integer pId;

    /**
     * 增加人
     */
    private String insertUser;

    /**
     * 修改人
     */
    private String modifyUser;

    /**
     * 增加时间
     */
    private Date insertDate;

    /**
     * 修改时间
     */
    private Date modifyDate;
}