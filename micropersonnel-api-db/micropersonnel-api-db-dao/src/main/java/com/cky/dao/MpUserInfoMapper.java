package com.cky.dao;

import com.cky.entity.MpUserInfo;

import java.util.List;

/**
 * 表mp_user_info ->  的基本功能实现
 *
 * @author Wales-Yu
 * @date 2021/06/10
 */
public interface MpUserInfoMapper {
    /**
     * deleteByPrimaryKey 实现
     *
     * @param id
     * @return null int
     * @author Wales-Yu
     * @date 2021-06-10 15:05:49
     */
    int deleteByPrimaryKey(String id);

    /**
     * insert 实现
     *
     * @param record
     * @return null int
     * @author Wales-Yu
     * @date 2021-06-10 15:05:49
     */
    int insert(MpUserInfo record);

    /**
     * insertSelective 实现
     *
     * @param record
     * @return null int
     * @author Wales-Yu
     * @date 2021-06-10 15:05:49
     */
    int insertSelective(MpUserInfo record);

    /**
     * selectByPrimaryKey 实现
     *
     * @param id
     * @return null com.cky.entity.MpUserInfo
     * @author Wales-Yu
     * @date 2021-06-10 15:05:49
     */
    MpUserInfo selectByPrimaryKey(String id);

    /**
     * 查询所有
     *
     * @return {@link MpUserInfo}
     */
    List<MpUserInfo> findAll();

    /**
     * updateByPrimaryKeySelective 实现
     *
     * @param record
     * @return null int
     * @author Wales-Yu
     * @date 2021-06-10 15:05:49
     */
    int updateByPrimaryKeySelective(MpUserInfo record);

    /**
     * updateByPrimaryKey 实现
     *
     * @param record
     * @return null int
     * @author Wales-Yu
     * @date 2021-06-10 15:05:49
     */
    int updateByPrimaryKey(MpUserInfo record);

    MpUserInfo selectByPhone(String phone);
}
