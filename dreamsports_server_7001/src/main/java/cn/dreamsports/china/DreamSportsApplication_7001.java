package cn.dreamsports.china;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 所有服务的注册中心
 */
@SpringBootApplication
@EnableEurekaServer
public class DreamSportsApplication_7001 {
    public static void main(String[] args) {
        SpringApplication.run(DreamSportsApplication_7001.class);
    }
}
