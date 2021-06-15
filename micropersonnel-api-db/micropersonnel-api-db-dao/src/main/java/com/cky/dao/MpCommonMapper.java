package com.cky.dao;

import com.cky.entity.MpCommon;

import java.util.List;

/**
* 表mp_common ->  的基本功能实现
*
* @author DESKTOP-E357TIF
* @date 2021/06/10
*/
public interface MpCommonMapper {
    /**
     *   deleteByPrimaryKey 实现
     * 
     * @param id
     * @return null int
     * @author DESKTOP-E357TIF
     * @date 2021-06-10 20:47:25
     */
    int deleteByPrimaryKey(String id);

    /**
     *   insert 实现
     * 
     * @param record
     * @return null int
     * @author DESKTOP-E357TIF
     * @date 2021-06-10 20:47:25
     */
    int insert(MpCommon record);

    /**
     *   insertSelective 实现
     * 
     * @param record
     * @return null int
     * @author DESKTOP-E357TIF
     * @date 2021-06-10 20:47:25
     */
    int insertSelective(MpCommon record);

    /**
     *   selectByPrimaryKey 实现
     * 
     * @param id
     * @return null com.cky.entity.MpCommon
     * @author DESKTOP-E357TIF
     * @date 2021-06-10 20:47:25
     */
    MpCommon selectByPrimaryKey(String id);

    /**
     *   updateByPrimaryKeySelective 实现
     * 
     * @param record
     * @return null int
     * @author DESKTOP-E357TIF
     * @date 2021-06-10 20:47:25
     */
    int updateByPrimaryKeySelective(MpCommon record);

    /**
     *   updateByPrimaryKey 实现
     * 
     * @param record
     * @return null int
     * @author DESKTOP-E357TIF
     * @date 2021-06-10 20:47:25
     */
    int updateByPrimaryKey(MpCommon record);

    List<MpCommon> finAll();
}