package org.llf.springcloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: luolifeng
 * Date: 2019-02-01
 * Time: 11:15
 */
@SpringBootApplication
@EnableEurekaServer
public class ServiceCenter {
    public static void  main(String[] args){
        SpringApplication.run(ServiceCenter.class, args);
    }
}

