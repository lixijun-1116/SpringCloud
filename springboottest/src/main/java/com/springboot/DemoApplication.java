package com.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @version v1.0
 * @ProjectName: SPRINGCLOUD
 * @ClassName: com.springboot.DemoApplication
 * @Description: TODO(一句话描述该类的功能)
 * @Author: 李茜骏
 * @Date: 2021/2/24 10:08
 */
@SpringBootApplication
public class DemoApplication {
    private static Logger logger = LoggerFactory.getLogger(DemoApplication.class);
    public static void main(String[] args) {
        logger.info("-----------开始启动---------");
        Long star = System.currentTimeMillis();
        SpringApplication.run(DemoApplication.class, args);
        Long stop = System.currentTimeMillis();
        long time = (stop - star)/1000;
        logger.info("-----------启动完毕---------;启动耗时(s):" + time);
    }
}
