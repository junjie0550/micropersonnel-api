package com.cky.dto;

import com.cky.entity.MpUserInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "micropersonnel-api-db-dao",path = "/mp/user")
public interface UserDto {
    /**
     * 用户管理按照id查询
     * @param id
     * @return {@link MpUserInfo }
     */
    @PostMapping("/findById")
     MpUserInfo findById(@RequestParam(value = "id") String id);

    /**
     * 用户全查
     * @return {@link MpUserInfo }
     */

    @PostMapping(value = "/findAll")
    List<MpUserInfo> findAll();

    /**
     *  插入用户表
     * @param mpUserInfo
     * @return {@link Integer}
     */

    @PostMapping(value = "/insertSelective")
    int insert(@RequestBody MpUserInfo mpUserInfo);

    /**
     * 更新用户表
     * @param mpUserInfo
     * @return {@link MpUserInfo}
     */

    @PostMapping("/updateByPrimaryKey")
    int update(@RequestBody MpUserInfo mpUserInfo);

    /**
     * 按照id删除用户表
     * @param id
     * @return {@link Integer}
     */
    @DeleteMapping("/deleteByPrimaryKey")
   int delect(String id);

}
