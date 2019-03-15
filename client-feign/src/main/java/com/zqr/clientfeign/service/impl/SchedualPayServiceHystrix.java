package com.zqr.clientfeign.service.impl;

import com.zqr.clientfeign.service.SchedualPayService;
import org.springframework.stereotype.Component;

@Component
public class SchedualPayServiceHystrix implements SchedualPayService {

    @Override
    public double delPay(Double money) {
        return 0;
    }
}
