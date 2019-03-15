package com.zqr.clientfeign.service;

import com.zqr.clientfeign.service.impl.SchedualStockServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//断路器使用：fallback指定类即可
@FeignClient(value = "stock",fallback = SchedualStockServiceHystrix.class)
public interface SchedualStockService {

    @RequestMapping(value = "stock/del",method = RequestMethod.GET)
    int delStock(@RequestParam(value = "name") String name,@RequestParam(value = "count") int count);

}
