package com.cky.service.impl;

import com.cky.dto.ArchiveDto;
import com.cky.dto.CommonDto;
import com.cky.entity.MpArchive;
import com.cky.entity.MpCommon;
import com.cky.service.ArchiveService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

@Service
public class ArchiveServiceImpl implements ArchiveService {

    @Resource
    private ArchiveDto archiveDto;

    @Resource
    private CommonDto commonDto;

    /**
     * 归档管理 查询所有
     *
     * @return {@link MpArchive}
     */
    @Override
    public List<MpArchive> findAll() {
        return null;
    }

    /**
     * 归档管理 新增/修改
     *
     * @param mpArchive {@link MpArchive}
     * @return {@link Integer}
     */
    @Override
    public Integer change(MpArchive mpArchive) {
        MpArchive entity = archiveDto.findById(mpArchive.getId());
        int flag = 0;
        if (entity != null) {
            flag = archiveDto.update(mpArchive);
        } else {
            mpArchive.setId(UUID.randomUUID().toString().replace("-", ""));

            flag = archiveDto.insert(mpArchive);
        }
        return flag;
    }

    /**
     * 归档管理 删除
     *
     * @param id id
     * @return {@link Integer}
     */
    @Override
    public Integer delete(String id) {
        return null;
    }
}
