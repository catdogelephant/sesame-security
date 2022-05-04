package com.zhumuchang.dongqu;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class SesameSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(SesameSecurityApplication.class, args);
        log.info("------------------------>>>>SesameSecurityApplication - 启动成功<<<<------------------------");
    }

}
