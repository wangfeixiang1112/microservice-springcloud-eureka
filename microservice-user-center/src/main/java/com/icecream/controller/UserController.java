package com.icecream.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("user")
@Slf4j
public class UserController {
    @GetMapping("doLogin/{username}/{password}")
    @ResponseBody
    public Map<String,Object> doLogin(@PathVariable("username") String username, @PathVariable("password") String password, HttpServletRequest request) {
        log.info("服务提供者:用户服务:账号{}-密码{}",username,password);
        String remoteHost = request.getRemoteHost();
        Integer serverPort = request.getServerPort();
        Map<String,Object> map = new HashMap<>();
        map.put("remoteHost",remoteHost);
        map.put("serverPort",serverPort);
        return map;
    }
}
