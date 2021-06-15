package com.cky.controller;

import com.cky.dao.MpPictureMapper;
import com.cky.entity.MpPicture;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("mp/picture")
public class  MpPictureController {
    @Resource
    private MpPictureMapper mpPictureMapper;

    @PostMapping("selectByid")
    public MpPicture select(String id){
        return mpPictureMapper.selectByPrimaryKey(id);
    }

    @DeleteMapping("/deleteByid")
    public int deleteByid(String id){
        return mpPictureMapper.deleteByPrimaryKey(id);
    }

    @PostMapping("/update")
    public int update(MpPicture mpPicture){
        return mpPictureMapper.updateByPrimaryKeySelective(mpPicture);
    }

    @PostMapping("insert")
    public int insert(MpPicture mpPicture){
        return mpPictureMapper.insertSelective(mpPicture);
    }

    @PostMapping("/finAll")
    List<MpPicture> finAll(){
        return mpPictureMapper.finAll();
    }

}
