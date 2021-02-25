package com.springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @version v1.0
 * @ProjectName: SPRINGCLOUD
 * @ClassName: DemoController
 * @Description: TODO(一句话描述该类的功能)
 * @Author: 李茜骏
 * @Date: 2021/2/24 10:50
 */
@Controller
public class DemoController {

    private static Logger logger = LoggerFactory.getLogger(DemoController.class);

    @Value("${test}")
    public String test;
    @RequestMapping(value = "/into")
    @ResponseBody
    public String hello(){
        logger.info("test的值:{}",test);
        return "Hello,Word!";
    }
}
