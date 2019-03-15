package com.zqr.zdal.service.impl;

import com.zqr.zdal.dao.RedisDao;
import com.zqr.zdal.service.IRedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class RedisServiceImpl implements IRedisService {

    @Autowired
    RedisDao redisDao;


    @Override
    public void setKey(String key, String value) {
        redisDao.setKey(key,value);
    }

    @Override
    public String getValue(String key) {
        return redisDao.getValue(key);
    }

    @Override
    public Map<Object, Object> getHashSet(String key){
        Map<Object, Object> values = redisDao.getHashSet(key);
        return values;
    }
}
