package com.cky.controller;

import com.cky.entity.MpArchive;
import com.cky.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author junjie
 * @version 1.0.0
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;

    /**
     *测试调用档案服务  查询所有
     * @return
     */
    @GetMapping("/find")
    public List<MpArchive> test(){
        List<MpArchive> all = testService.findAll();
        // all.forEach(System.out::println);
        all.forEach(mpArchive -> {
            System.out.println("mpArchive: "+mpArchive);
        });
        return all;
    }
}
