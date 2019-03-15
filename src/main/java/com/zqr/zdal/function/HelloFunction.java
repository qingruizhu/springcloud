package com.zqr.zdal.function;

import com.zqr.zdal.vo.Book;
import com.zqr.zdal.vo.Zqr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloFunction {
    @Autowired
    private Zqr zqr;
    @Autowired
    private Book book;
    @Value("${com.book.name}")
    private String name;

    @RequestMapping("/zqr")
    public String zqr() {
        return zqr.toString();
    }
    @RequestMapping("/book")
    public String book() {
        return book.toString();
    }

    @RequestMapping("/getName")
    public String getName() {
        System.out.print(name);
        return name;
    }
}