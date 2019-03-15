package com.zqr.clientstock.function;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("stock")
public class StockFunction {

private static Logger logger = LoggerFactory.getLogger(StockFunction.class);

    @RequestMapping("/del")
    public int del(
            @RequestParam String name,
            @RequestParam int count){
        logger.info("庫存消耗["+name+"]的数量："+count);
        return count;
    }

}
