package com.cky.service.impl;

import com.cky.dto.UserDto;
import com.cky.entity.MpUserInfo;
import com.cky.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    /**
     * 导入userDto
     */
    @Resource
    private UserDto userDto;


    @Override
    public MpUserInfo findById(String id) {
        return userDto.findById(id);
    }

    @Override
    public List<MpUserInfo> findAll() {
        return userDto.findAll();
    }

    @Override
    public int insert(MpUserInfo mpUserInfo) {
        return userDto.insert(mpUserInfo);
    }

    @Override
    public int update(MpUserInfo mpUserInfo) {
        return userDto.update(mpUserInfo);
    }

    @Override
    public int delect(String id) {
        return userDto.delect(id);
    }


}
