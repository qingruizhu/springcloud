package com.zqr.clientfeign.service.impl;

import com.zqr.clientfeign.service.SchedualStockService;
import org.springframework.stereotype.Component;

@Component
public class SchedualStockServiceHystrix implements SchedualStockService {

    @Override
    public int delStock(String name, int count) {
        return 0;
    }
}
