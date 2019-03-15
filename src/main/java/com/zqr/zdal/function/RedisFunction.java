package com.zqr.zdal.function;

import com.zqr.zdal.service.IRedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/redis")
public class RedisFunction {

    @Autowired
    IRedisService redisService;

    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public String getRedisValue(@RequestParam String key){
        return  redisService.getValue(key);
    }

    @RequestMapping(value = "/set",method = RequestMethod.GET)
    public void getRedisValue(@RequestParam String key,
                                @RequestParam String value){
          redisService.setKey(key,value);
    }
    @RequestMapping(value = "/getHashSet",method = RequestMethod.GET)
    public  Map<Object, Object> getHashSet(@RequestParam String key){
        Map<Object, Object> values = redisService.getHashSet(key);
        return values;
    }
}
