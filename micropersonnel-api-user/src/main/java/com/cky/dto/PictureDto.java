package com.cky.dto;

import com.cky.entity.MpPicture;
import org.springframework.boot.actuate.endpoint.annotation.FilteredEndpoint;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(value = "micropersonnel-api-db-dao",path = "/")
@RequestMapping("mp/picture")
public interface PictureDto {

    @PostMapping("/selectByid")
    MpPicture select(String id);

    @DeleteMapping("/deleteByid")
    int deleteByid(String id);

    @PostMapping("/update")
    int update(MpPicture mpPicture);

    @PostMapping("insert")
    int insert(MpPicture mpPicture);

    @PostMapping("/finAll")
    List<MpPicture> finAll();
}
