package com.cky.service;

import com.cky.entity.MpPicture;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public interface PictureService {


    MpPicture select(String id);

    int deleteByid(String id);


    int update(MpPicture mpPicture);


    int insert(MpPicture mpPicture);


    List<MpPicture> finAll();
}
