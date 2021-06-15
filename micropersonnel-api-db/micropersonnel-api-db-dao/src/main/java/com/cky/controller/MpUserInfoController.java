package com.cky.controller;

import com.cky.dao.MpUserInfoMapper;
import com.cky.entity.MpUserInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wales
 * <p>
 * 员工信息数据相关对外接口暴露
 * </p>
 */
@RestController
@RequestMapping(value = "/mp/user")
public class MpUserInfoController {

    @Resource
    private MpUserInfoMapper mpUserInfoMapper;

    /**
     * 根据 ID 查询员工数据
     *
     * @param id id
     * @return {@link Object}
     */
    @PostMapping(value = "/findById")
    public MpUserInfo findById(@RequestParam(value = "id") String id) {
        return mpUserInfoMapper.selectByPrimaryKey(id);
    }

    /**
     * 查询所有 分页
     *
     * @return {@link Object}
     */
    @PostMapping(value = "/findAll")
    public List<MpUserInfo> findAll() {
        return mpUserInfoMapper.findAll();
    }

    /**
     * 新增 员工信息表
     *
     * @param mpUserInfo {@link MpUserInfo}
     * @return {@link Object}
     */
    @PostMapping(value = "/insertSelective")
    public int insert(@RequestBody MpUserInfo mpUserInfo) {
        return mpUserInfoMapper.insertSelective(mpUserInfo);
    }



    @PostMapping("/updateByPrimaryKey")
    public int update(@RequestBody MpUserInfo mpUserInfo){
        return mpUserInfoMapper.updateByPrimaryKeySelective(mpUserInfo);
    }

    @DeleteMapping("/deleteByPrimaryKey")
    public int delect(String id){
        return mpUserInfoMapper.deleteByPrimaryKey(id);
    }
    @PostMapping("/selectByPhone")
    public MpUserInfo selectByPhone(@RequestParam(value = "phone") String Phone){
        return mpUserInfoMapper.selectByPhone(Phone);
    }


}
