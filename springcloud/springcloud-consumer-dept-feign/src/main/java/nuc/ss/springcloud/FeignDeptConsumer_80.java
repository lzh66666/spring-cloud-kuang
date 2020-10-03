package nuc.ss.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

// Ribbon和Eureka整合之后，客户端可以直接调用，不用关系IP地址
@SpringBootApplication
@EnableEurekaClient //开启Eureka 客户端
@EnableFeignClients(basePackages = {"nuc.ss.springcloud"})
public class FeignDeptConsumer_80 {
    public static void main(String[] args) {
        SpringApplication.run(FeignDeptConsumer_80.class,args);
    }
}
