package com.chen.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@Slf4j
@RestController
public class FlowLimitController {

    @GetMapping("/testA")
    public String testA(){
        try{
            //TimeUnit.MILLISECONDS.sleep(800);
            System.out.println(Thread.currentThread().getName());
        }catch (Exception e){
            e.printStackTrace();
        }
        return "----------testA";
    }

    @GetMapping("/testB")
    public String testB(){
        log.info(Thread.currentThread().getName());
        return "----------testB";
    }

    //服务降级
    @GetMapping("/testD")
    public String testD(){
        //测试慢调用比例
        try{
            TimeUnit.SECONDS.sleep(1);

        }catch (Exception e){
            e.printStackTrace();
        }
        log.info("testD 测试RT");
        return "---------testD";
    }

    @GetMapping("/testE")
    public String testE(){
        log.info("testE,测试异常比例");
        int age = 10/0;
        return "----------testE";
    }

    @GetMapping("/testF")
    public String testF(){
        log.info("testF,测试异常数");
        int age = 10/0;
        return "----------testF";
    }

    //热点限流
    @GetMapping("/testHotKey")
    @SentinelResource(value = "testHotKey",blockHandler = "deal_testHotKey")
    public String testHotKey(@RequestParam(value = "p1",required = false) String p1,
                             @RequestParam(value = "p2",required = false) String p2){
        return "----------testHotKey";
    }

    public String deal_testHotKey(String p1, String p2, BlockException e){
        return "----------deal_testHotKey";//sentinel系统默认提示，Blocked by sentinel (flow limiting)
    }
}
