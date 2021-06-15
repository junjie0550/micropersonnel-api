package com.cky.controller;

import com.cky.Result;
import com.cky.entity.MpArchive;
import com.cky.service.ArchiveService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author wales
 * <p>
 * 归档管理 对外暴露接口
 */
@RestController
@RequestMapping(value = "/archive")
public class ArchiveController {

    @Resource
    private ArchiveService archiveService;

    /**
     * 归档管理 新增/修改 接口
     *
     * @param mpArchive {@link MpArchive}
     * @return {@link Result}
     */
    @PostMapping(value = "/change")
    public Result change(@RequestBody MpArchive mpArchive) {
        Result result = new Result();
        int flag = 0;
        try {
            flag = archiveService.change(mpArchive);
            result.setFlag(true);
        } catch (Exception e) {
            result.setData(e.getMessage());
            result.setFlag(false);
        }
        result.setData(flag > 0);
        return result;
    }

    /**
     * 归档管理 删除
     *
     * @param id id
     * @return {@link Result}
     */
    @DeleteMapping(value = "/delete")
    public Result delete(@RequestParam(value = "id") String id) {
        Result result = new Result();
        int flag = 0;
        try {
            flag = archiveService.delete(id);
            result.setFlag(true);
            result.setData(flag);
        } catch (Exception e) {
            result.setData(e.getMessage());
            result.setFlag(false);
        }
        return result;
    }

}
