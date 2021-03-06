package com.hanyi.job;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName: middleground com.hanyi.job JobApplication
 * @Author: weiwenchang
 * @Description: java类作用描述
 * @CreateDate: 2019-10-30 22:18
 * @Version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class JobApplication {

    public static void main(String[] args) {
        SpringApplication.run(JobApplication.class,args);
    }

}
