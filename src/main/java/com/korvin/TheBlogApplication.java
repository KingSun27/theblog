package com.korvin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.korvin.common.Config;

@SpringBootApplication
@EnableCaching
public class TheBlogApplication {

	private static final Logger log = LoggerFactory.getLogger(TheBlogApplication.class);


    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
		log.info("TheBlogApplication服务正在启动...");
        SpringApplication.run(TheBlogApplication.class, args);
		log.info("TheBlogApplication服务启动成功!");


		
    }
}
