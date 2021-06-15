package com.cky.dto;

import com.cky.entity.MpArchive;
import com.cky.entity.MpUserInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author wales
 * <p>
 * 远程接口调用 档案管理
 */
@FeignClient(name = "micropersonnel-api-db-dao", path = "/")
public interface ArchiveDto {

    /**
     * 档案管理 根据 ID
     *
     * @param id id
     * @return {@link MpArchive}
     */
    @PostMapping(value = "/mp/archive/findById")
    MpArchive findById(@RequestParam(value = "id") String id);

    /**
     * 远程调用方法 查询所有
     *
     * @return {@link MpUserInfo}
     */
    @PostMapping(value = "/mp/archive/findAall")
    List<MpArchive> findAll();

    /**
     * 远程调用方法 新增
     *
     * @param mpArchive {@link MpArchive}
     * @return {@link Integer}
     */
    @PostMapping(value = "/mp/archive/insert")
    Integer insert(@RequestBody MpArchive mpArchive);

    /**
     * 远程接口调用 更新
     *
     * @param mpArchive {@link MpArchive}
     * @return {@link Integer}
     */
    @PutMapping(value = "/mp/archive/update")
    Integer update(@RequestBody MpArchive mpArchive);

    /**
     * 远程接口调用 删除
     *
     * @param id id
     * @return {@link Integer}
     */
    @DeleteMapping(value = "/mp/archive/delete")
    Integer delete(@RequestParam(value = "id") String id);

}
