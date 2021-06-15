package com.cky.dao;

import com.cky.entity.MpArchive;

import java.util.List;

/**
 * 表mp_archive ->  的基本功能实现
 *
 * @author Wales-Yu
 * @date 2021/06/10
 */
public interface MpArchiveMapper {

    /**
     * 查询所有 档案管理数据
     *
     * @return {@link MpArchive}
     */
    List<MpArchive> findAll();

    /**
     * deleteByPrimaryKey 实现
     *
     * @param id
     * @return null int
     * @author Wales-Yu
     * @date 2021-06-10 14:57:45
     */
    int deleteByPrimaryKey(String id);

    /**
     * insert 实现
     *
     * @param record
     * @return null int
     * @author Wales-Yu
     * @date 2021-06-10 14:57:45
     */
    int insert(MpArchive record);

    /**
     * insertSelective 实现
     *
     * @param record
     * @return null int
     * @author Wales-Yu
     * @date 2021-06-10 14:57:45
     */
    int insertSelective(MpArchive record);

    /**
     * selectByPrimaryKey 实现
     *
     * @param id
     * @return null com.cky.entity.MpArchive
     * @author Wales-Yu
     * @date 2021-06-10 14:57:45
     */
    MpArchive selectByPrimaryKey(String id);

    /**
     * updateByPrimaryKeySelective 实现
     *
     * @param record
     * @return null int
     * @author Wales-Yu
     * @date 2021-06-10 14:57:45
     */
    int updateByPrimaryKeySelective(MpArchive record);

    /**
     * updateByPrimaryKey 实现
     *
     * @param record
     * @return null int
     * @author Wales-Yu
     * @date 2021-06-10 14:57:45
     */
    int updateByPrimaryKey(MpArchive record);
}
