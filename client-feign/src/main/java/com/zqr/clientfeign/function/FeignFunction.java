package com.zqr.clientfeign.function;


import com.zqr.clientfeign.service.SchedualPayService;
import com.zqr.clientfeign.service.SchedualStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/feign")
public class FeignFunction {

    @Autowired
    SchedualStockService schedualStockService;
    @Autowired
    SchedualPayService schedualPayService;

    @RequestMapping(value = "/consume")
    public String consume(
            @RequestParam(value = "name") String name,
            @RequestParam(value = "count") int count
    ){
        int ct = schedualStockService.delStock(name,count);
        if (ct == count) {
            double rst = schedualPayService.delPay((double) count * 100);
            return String.valueOf(rst);
        }
        return String.valueOf(ct);
    }
}
