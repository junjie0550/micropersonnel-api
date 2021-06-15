package com.cky.dto;

import com.cky.entity.MpCommon;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * @author wales
 * <p>
 * Common 远程接口调用
 */
@FeignClient(name = "micropersonnel-api-db-dao", path = "/")
public interface CommonDto {

    /**
     * 远程调用 Common 增加
     *
     * @param mpCommon {@link MpCommon}
     * @return {@link Integer}
     */
    @PostMapping(value = "/mp/common/insert")
    Integer insert(@RequestBody MpCommon mpCommon);

    /**
     * 远程调用 Common 修改
     *
     * @param mpCommon {@link MpCommon}
     * @return {@link Integer}
     */
    @PutMapping(value = "/mp/common/update")
    Integer update(@RequestBody MpCommon mpCommon);

    /**
     * 远程调用 Common 删除
     *
     * @param id id
     * @return {@link Integer}
     */
    @DeleteMapping(value = "/mp/common/deleteById")
    Integer delete(@RequestParam(value = "id") String id);

}
