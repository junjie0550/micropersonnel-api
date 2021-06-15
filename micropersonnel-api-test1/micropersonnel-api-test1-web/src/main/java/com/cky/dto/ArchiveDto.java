package com.cky.dto;

import com.cky.entity.MpArchive;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient(name = "micropersonnel-api-db-dao",path = "/")
public interface ArchiveDto {

    @PostMapping(value = "/mp/archive/findAll")
    List<MpArchive> findAll();
}
