package com.example.simplewebapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Hello World!!!";
    }

    @GetMapping("/systemInfo")
    public String info() {
        StringBuilder sysInfo=new StringBuilder();

        String osName=System.getProperty("os.name");
        String osVersion=System.getProperty("os.version");

        sysInfo.append("OS name: ").append(osName).append("\n");
        sysInfo.append("OS version: ").append(osVersion);

        return sysInfo.toString();
    }


}
