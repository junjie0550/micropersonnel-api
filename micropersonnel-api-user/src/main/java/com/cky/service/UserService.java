package com.cky.service;

import com.cky.entity.MpUserInfo;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface UserService {
    /**
     * 用户管理按照id查询
     * @param id
     * @return {@link MpUserInfo }
     */

    MpUserInfo findById(@RequestParam(value = "id") String id);

    /**
     * 用户全查
     * @return {@link MpUserInfo }
     */


    List<MpUserInfo> findAll();

    /**
     *  插入用户表
     * @param mpUserInfo
     * @return {@link Integer}
     */


    int insert(@RequestBody MpUserInfo mpUserInfo);

    /**
     * 更新用户表
     * @param mpUserInfo
     * @return {@link MpUserInfo}
     */


    int update(@RequestBody MpUserInfo mpUserInfo);

    /**
     * 按照id删除用户表
     * @param id
     * @return {@link Integer}
     */

    int delect(String id);




}
