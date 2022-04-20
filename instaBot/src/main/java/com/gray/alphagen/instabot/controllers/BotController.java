package com.gray.alphagen.instabot.controllers;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.gray.alphagen.instabot.components.Shedulers;
import com.gray.alphagen.instabot.models.AccessToken;
import com.gray.alphagen.instabot.services.FacebookService;
import com.gray.alphagen.instabot.services.YmlService;
import com.gray.alphagen.instabot.services.impl.FacebookServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Pasindu Raveen
 * Date: 14-Apr-22
 * Time: 3:16 PM
 * instaBot
 */
@Slf4j
@RestController
@RequestMapping(value = "/")
public class BotController {


    private FacebookService facebookService;
    private YmlService ymlService;

    @Autowired
    public BotController(FacebookService facebookService, YmlService ymlService) {
        this.facebookService = facebookService;
        this.ymlService = ymlService;
    }

    @PostMapping("AccessLink")
    public String startBot(){
        return "<a href="+facebookService.generateFacebookAuthorizationURL()+">Visit</a>\n";
    }
    @GetMapping
    public String checkBot(){
        return "Check Running";
    }
    @GetMapping("gen")
    public String genBot(@RequestParam("code") String code){
        try {
            log.info("code -- "+code);
            String token = facebookService.generateFacebookAccessToken(code);
            ymlService.saveAccessToken(new AccessToken(token,"",new Date()));
        } catch (StreamReadException | DatabindException e) {
            log.warn(e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "Check Success";
    }
//    @GetMapping("gen")
    public String genBot(@RequestParam("error_code") String code,@RequestParam("error_message") String massage){

        return "Error : "+code+" n/ massage : "+massage+" n/";
    }

}
