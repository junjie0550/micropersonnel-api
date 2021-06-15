package com.cky.controller;

import com.cky.Result;
import com.cky.entity.MpUserInfo;
import com.cky.service.LoginService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author wales
 * <p>
 * Login 对外接口暴露
 */
@RestController
@RequestMapping(value = "/login")
public class LoginController {

    @Resource
    private LoginService loginService;

    /**
     * 登录接口
     *
     * @param phone phone
     * @return {@link Result}
     */
    @PostMapping(value = "/byPhone")
    public Result login(@RequestParam(value = "phone") String phone) {
        Result result = new Result();
        MpUserInfo login = null;
        try {
            login = loginService.login(phone);
            result.setFlag(true);
            result.setData(login);
        } catch (Exception e) {
            result.setData(e.getMessage());
            result.setFlag(false);
        }
        return result;
    }
}
