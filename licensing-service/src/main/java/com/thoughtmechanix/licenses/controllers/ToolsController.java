package com.thoughtmechanix.licenses.controllers;

import com.thoughtmechanix.licenses.services.DiscoveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="v1/tools")
public class ToolsController {
    @Autowired
    private DiscoveryService discoveryService;

    @RequestMapping(value="/nacos/services",method = RequestMethod.GET)
    public List<String> getNacosServices() {

        return discoveryService.getNacosServices();
    }
//    客户端返回的结果：
//    [
//            "licensingservice:http://10.1.3.226:8080",
//            "organizationservice:http://10.1.3.224:8080",
//            "organizationservice:http://10.1.3.228:8080",
//            "organizationservice:http://10.1.3.227:8080"
//            ]
}
