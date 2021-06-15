package com.cky.dto;

import com.cky.entity.MpUserInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author wales
 * <p>
 * Login 相关数据获取
 */
@FeignClient(name = "micropersonnel-api-db-dao", path = "/")
public interface LoginDto {

    /**
     * 远程调用方法 根据 ID查询
     *
     * @param id id
     * @return {@link MpUserInfo}
     */
    @PostMapping(value = "/mp/user/findById")
    MpUserInfo findById(@RequestParam(value = "id") String id);

    /**
     * 远程调用方法 查询所有
     *
     * @return {@link MpUserInfo}
     */
    @PostMapping(value = "/mp/user/findAlll")
    List<MpUserInfo> findAll();

    /**
     * 远程调用方法 增加
     *
     * @param mpUserInfo {@link MpUserInfo}
     * @return {@link Integer}
     */
    @PostMapping(value = "/mp/user/insert")
    Integer insert(@RequestBody MpUserInfo mpUserInfo);

    /**
     * 远程调用方法 修改
     *
     * @param mpUserInfo {@link MpUserInfo}
     * @return {@link Integer}
     */
    @PutMapping(value = "/mp/user/update")
    Integer update(@RequestBody MpUserInfo mpUserInfo);

    /**
     * 远程调用方法 删除
     *
     * @param id id
     * @return {@link Integer}
     */
    @DeleteMapping(value = "/mp/user/delete")
    Integer delete(@RequestParam(value = "id") String id);

    /**
     * 远程调用方法 根据 Phone 查询
     *
     * @param phone phone
     * @return {@link MpUserInfo}
     */
    @PostMapping(value = "/mp/user/selectByPhone")
    MpUserInfo findByPhone(@RequestParam(value = "phone") String phone);
}
