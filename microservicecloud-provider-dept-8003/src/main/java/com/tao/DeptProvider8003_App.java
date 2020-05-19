package com.tao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName DeptProvider8001_App
 * @Description 项目入口
 * @Author tyq
 * @Date 2020/5/12 1:17
 * @Version V1.0
 **/
@SpringBootApplication
@EnableEurekaClient // 本服务启动后会自动注册进eureka服务中
public class DeptProvider8003_App {
    public static void main (String[] args) {
        SpringApplication.run(DeptProvider8003_App.class,args);
    }
}
