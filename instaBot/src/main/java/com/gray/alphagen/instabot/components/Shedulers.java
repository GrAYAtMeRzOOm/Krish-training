package com.gray.alphagen.instabot.components;

import ch.qos.logback.core.util.FixedDelay;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Pasindu Raveen
 * Date: 14-Apr-22
 * Time: 9:34 PM
 * instaBot
 */

@Slf4j
@Component
public class Shedulers {
    @Scheduled(fixedDelay = 24*60*60*1000)
    public void TimeRun(){
        log.info("One For 90 Days");
    }
}
