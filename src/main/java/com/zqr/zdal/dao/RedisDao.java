package com.zqr.zdal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.*;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

@Repository
public class RedisDao {

    @Autowired
    StringRedisTemplate template;

    public void setKey(String key,String value){
        ValueOperations<String, String> ops = template.opsForValue();
        ops.set(key,value,1, TimeUnit.MINUTES);
    }

    public String getValue(String key){
        ValueOperations<String, String> ops = this.template.opsForValue();
        String value = ops.get(key);
        return value;
    }

    public Long setLst(String key,String value){
        ListOperations<String, String> lst = this.template.opsForList();
        Long count = lst.leftPush(key, value);
        return count;
    }

    public  List<String> getLst(String key,long start,long end){
        ListOperations<String, String> lst = this.template.opsForList();
        List<String> rst = lst.range(key, start, end);
        return rst;
    }

    public  Set<String> getSet(String key){
        SetOperations<String, String> set = this.template.opsForSet();
        Set<String> members = set.members(key);
        return members;
    }

    public  Set<ZSetOperations.TypedTuple<String>> getSortedSet(String key,long start,long end){
        ZSetOperations<String, String> zset = this.template.opsForZSet();
        Set<ZSetOperations.TypedTuple<String>> rst = zset.rangeWithScores(key, start, end);
        return rst;
    }

    public Map<Object, Object> getHashSet(String key){
        HashOperations<String, Object, Object> hset = this.template.opsForHash();
        Map<Object, Object> entries = hset.entries(key);
        return entries;
    }

}
