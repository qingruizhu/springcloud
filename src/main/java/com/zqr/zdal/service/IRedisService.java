package com.zqr.zdal.service;


import java.util.Map;

public interface IRedisService {
    public void setKey(String key,String value);
    public String getValue(String key);
    public Map<Object, Object> getHashSet(String key);
}
