package com.cky.service;

import com.cky.entity.MpArchive;

import java.util.List;

/**
 * @author wales
 * <p>
 * 归档管理 Service
 */
public interface ArchiveService {

    /**
     * 归档管理 查询所有
     *
     * @return {@link MpArchive}
     */
    List<MpArchive> findAll();

    /**
     * 归档管理 新增/修改
     *
     * @param mpArchive {@link MpArchive}
     * @return {@link Integer}
     */
    Integer change(MpArchive mpArchive);

    /**
     * 归档管理 删除
     *
     * @param id id
     * @return {@link Integer}
     */
    Integer delete(String id);

}
