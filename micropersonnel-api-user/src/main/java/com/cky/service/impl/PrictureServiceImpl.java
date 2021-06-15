package com.cky.service.impl;

import com.cky.dto.PictureDto;
import com.cky.entity.MpPicture;
import com.cky.service.PictureService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PrictureServiceImpl implements PictureService{
    @Resource
    private PictureDto pictureDto;


    @Override
    public MpPicture select(String id) {
        return pictureDto.select(id);
    }

    @Override
    public int deleteByid(String id) {
        return pictureDto.deleteByid(id);
    }

    @Override
    public int update(MpPicture mpPicture) {
        return pictureDto.update(mpPicture);
    }

    @Override
    public int insert(MpPicture mpPicture) {
        return pictureDto.insert(mpPicture);
    }

    @Override
    public List<MpPicture> finAll() {
        return pictureDto.finAll();
    }
}
