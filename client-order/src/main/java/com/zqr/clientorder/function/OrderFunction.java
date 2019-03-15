package com.zqr.clientorder.function;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RestController
@RequestMapping("/order")
public class OrderFunction {
    private static Logger logger = LoggerFactory.getLogger(OrderFunction.class);

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/consume")
    public String consume(
            @RequestParam String name,
            @RequestParam int count) {
        logger.info("訂單消耗[" + name + "]的数量：" + count);
        Map<String, String> map = restTemplate.getForObject("http://stock/stock/del?name=" + name + "&count=" + 10, Map.class);
        String ct = map.get("");
        return ct;
    }
}
