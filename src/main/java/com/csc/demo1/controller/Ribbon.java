package com.csc.demo1.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @Description:
 * @PackageName: com.csc.gatewaybench.gateway.controller
 * @Author: csc
 * @Create: 2020-08-04 16:09
 * @Version: 1.0
 */

@RestController
@RequestMapping("ribbon")
public class Ribbon {

    @GetMapping(value = "get")
    public String get() {
        System.out.println("9520");
        return "springcloud gateway get";
    }

    @PostMapping(value = "post/{id}")
    public String post1(@PathVariable("id") String id) {
        return "springcloud gateway post " + id;
    }



}
