package com.cky.service;

import com.cky.entity.MpUserInfo;

/**
 * @author wales
 * <p>
 * Login Service
 */
public interface LoginService {

    /**
     * 登录相关
     *
     * @param phone phone
     * @return {@link MpUserInfo}
     */
    MpUserInfo login(String phone);
}
