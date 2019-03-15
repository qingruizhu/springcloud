package com.zqr.clientfeign.service;

import com.zqr.clientfeign.service.impl.SchedualPayServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "pay",fallback = SchedualPayServiceHystrix.class)
public interface SchedualPayService {

    @RequestMapping(value = "pay/del")
    double delPay(@RequestParam(value = "money")  Double money);

}
