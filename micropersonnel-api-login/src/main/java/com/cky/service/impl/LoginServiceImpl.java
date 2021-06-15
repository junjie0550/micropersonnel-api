package com.cky.service.impl;

import com.cky.dto.LoginDto;
import com.cky.entity.MpUserInfo;
import com.cky.service.LoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LoginServiceImpl implements LoginService {

    @Resource
    private LoginDto loginDto;

    /**
     * 登录相关
     *
     * @param phone phone
     * @return {@link MpUserInfo}
     */
    @Override
    public MpUserInfo login(String phone) {
        return loginDto.findByPhone(phone);
    }
}
