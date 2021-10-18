package com.zmm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zmm
 * @time: 2021/10/18
 */

@RestController
@RequestMapping("/Hello")
public class Controller {
    @RequestMapping("/World")
    public String helloWorld(String s){
        System.out.println("传入的值为："+s);
        return "传入的值为："+s;
    }
}
