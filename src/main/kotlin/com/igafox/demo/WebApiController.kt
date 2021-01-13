package com.igafox.demo

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class WebApiController {

    @RequestMapping("hello")
    private fun hello(): String {
        return "Hello, IgaWorld!"
    }

}