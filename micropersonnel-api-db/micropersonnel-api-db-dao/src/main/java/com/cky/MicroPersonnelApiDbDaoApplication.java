package com.cky;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * @author wales
 * <p>
 * DAO 对外接口暴露启动类
 */
@SpringCloudApplication
@MapperScan({"com.cky.dao.**"})
public class MicroPersonnelApiDbDaoApplication {
    public static void main(String[] args) {
        SpringApplication.run(MicroPersonnelApiDbDaoApplication.class, args);
    }
}
