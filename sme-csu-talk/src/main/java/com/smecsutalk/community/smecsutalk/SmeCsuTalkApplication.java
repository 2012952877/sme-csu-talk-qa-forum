package com.smecsutalk.community.smecsutalk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SmeCsuTalkApplication {
    // 传统的方式要把所有的文件打成var包然后部署到TOMCAT里，现在直接用SpringApplication.run就能直接右键运行整个SpringBoot项目
    // SpringBoot本身就是集成了SpringMVC和TOMCAT的
    public static void main(String[] args) {
        SpringApplication.run(SmeCsuTalkApplication.class, args);
    }

}
