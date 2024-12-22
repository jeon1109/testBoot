package com.testBoot.controller;

import com.testBoot.http.BaseResponse;
import com.testBoot.http.RestApiException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class HelloWorldController {
    @GetMapping("/hello")
    public Map<String, String> test(@RequestParam String code) {
        try {
            return Collections.singletonMap("message", code);
        }
        catch (Exception e){
            throw new RestApiException(BaseResponse.BAD_REQUEST);
        }
    }

}
