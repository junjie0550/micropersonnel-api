package com.cky.controller;

import com.cky.dao.MpCommonMapper;
import com.cky.entity.MpCommon;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/mp/common")
public class MpCommonController {

    @Resource
    private MpCommonMapper mpCommonMapper;

    @PostMapping("/insert")
    public int insert(@RequestBody MpCommon mpCommon){
        return mpCommonMapper.insertSelective(mpCommon);
    }

    @PostMapping("/update")
    public int update(@RequestBody MpCommon mpCommon){
        return mpCommonMapper.updateByPrimaryKeySelective(mpCommon);
    }

    @PostMapping("/selectByid")
    public MpCommon select(@RequestParam(value = "id") String id){
        return mpCommonMapper.selectByPrimaryKey(id);
    }

    @PostMapping("/finAll")
    public List<MpCommon> list(){
        return mpCommonMapper.finAll();
    }
    @DeleteMapping("/deleteById")
    public int delete(String id){
        return mpCommonMapper.deleteByPrimaryKey(id);
    }
}
