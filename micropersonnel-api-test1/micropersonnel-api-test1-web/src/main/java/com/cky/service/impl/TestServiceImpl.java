package com.cky.service.impl;

import com.cky.dto.ArchiveDto;
import com.cky.entity.MpArchive;
import com.cky.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author junjie
 * @version 1.0.0
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private ArchiveDto archiveDto;

    @Override
    public List<MpArchive> findAll(){
        //使用openFeign调用档案服务  查询所有
        return archiveDto.findAll();
    }
}
