package com.cky.controller;

import com.cky.dao.MpArchiveMapper;
import com.cky.entity.MpArchive;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wales
 * <p>
 * 档案管理 DAO 对外暴露接口
 */
@RestController
@RequestMapping(value = "/mp/archive")
public class MpArchiveController {

    @Resource
    private MpArchiveMapper mpArchiveMapper;

    /**
     * 档案管理 根据ID 查询
     *
     * @param id id
     * @return {@link Object}
     */
    @PostMapping(value = "/findById")
    public MpArchive findById(@RequestParam(value = "id") String id) {
        return mpArchiveMapper.selectByPrimaryKey(id);
    }

    /**
     * 档案管理 查询所有
     *
     * @return {@link Object}
     */
    @PostMapping(value = "findAll")
    public List<MpArchive> findAll() {
        return mpArchiveMapper.findAll();
    }

    /**
     * 档案管理 数据插入
     *
     * @param mpArchive {@link MpArchive}
     * @return {@link Object}
     */
    @PostMapping(value = "/insert")
    public Integer insert(@RequestBody MpArchive mpArchive) {
        return mpArchiveMapper.insertSelective(mpArchive);
    }

    /**
     * 档案管理 更新
     *
     * @param mpArchive {@link MpArchive}
     * @return {@link Object}
     */
    @PutMapping(value = "/update")
    public Integer update(@RequestBody MpArchive mpArchive) {
        return mpArchiveMapper.updateByPrimaryKeySelective(mpArchive);
    }

    /**
     * 档案管理 删除
     *
     * @param id id
     * @return {@link Object}
     */
    @DeleteMapping(value = "/delete")
    public Integer delete(@RequestParam(value = "id") String id) {
        return mpArchiveMapper.deleteByPrimaryKey(id);
    }
}
