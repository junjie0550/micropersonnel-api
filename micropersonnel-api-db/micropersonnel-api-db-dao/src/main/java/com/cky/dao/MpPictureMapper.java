package com.cky.dao;

import com.cky.entity.MpPicture;

import java.util.List;

/**
* 表mp_picture ->  的基本功能实现
*
* @author DESKTOP-E357TIF
* @date 2021/06/10
*/
public interface MpPictureMapper {
    /**
     *   deleteByPrimaryKey 实现
     *
     * @param id
     * @return null int
     * @author DESKTOP-E357TIF
     * @date 2021-06-10 20:56:58
     */
    int deleteByPrimaryKey(String id);

    /**
     *   insert 实现
     *
     * @param record
     * @return null int
     * @author DESKTOP-E357TIF
     * @date 2021-06-10 20:56:58
     */
    int insert(MpPicture record);

    /**
     *   insertSelective 实现
     *
     * @param record
     * @return null int
     * @author DESKTOP-E357TIF
     * @date 2021-06-10 20:56:58
     */
    int insertSelective(MpPicture record);

    /**
     *   selectByPrimaryKey 实现
     *
     * @param id
     * @return null com.cky.entity.MpPicture
     * @author DESKTOP-E357TIF
     * @date 2021-06-10 20:56:58
     */
    MpPicture selectByPrimaryKey(String id);

    /**
     *   updateByPrimaryKeySelective 实现
     *
     * @param record
     * @return null int
     * @author DESKTOP-E357TIF
     * @date 2021-06-10 20:56:58
     */
    int updateByPrimaryKeySelective(MpPicture record);

    /**
     *   updateByPrimaryKeyWithBLOBs 实现
     *
     * @param record
     * @return null int
     * @author DESKTOP-E357TIF
     * @date 2021-06-10 20:56:58
     */
    int updateByPrimaryKeyWithBLOBs(MpPicture record);

    /**
     *   updateByPrimaryKey 实现
     *
     * @param record
     * @return null int
     * @author DESKTOP-E357TIF
     * @date 2021-06-10 20:56:58
     */
    int updateByPrimaryKey(MpPicture record);

    List<MpPicture> finAll();
}
