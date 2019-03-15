package com.zqr.clientpay.function;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "pay")
public class PayFunction {
    private static Logger logger = LoggerFactory.getLogger(PayFunction.class);

    @RequestMapping("/del")
    public Double delMoney(
            @RequestParam(value = "money") Double money
    ){
        logger.info("Pay系统消费money="+money);
        return  money;
    }
}
