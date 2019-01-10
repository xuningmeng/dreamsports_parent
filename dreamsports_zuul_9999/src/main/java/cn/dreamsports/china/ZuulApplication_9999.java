package cn.dreamsports.china;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 网关端口，接收所有网络请求(包括非java格式的请求)解析并转发
 * 对应服务
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class ZuulApplication_9999 {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication_9999.class);
    }
}
