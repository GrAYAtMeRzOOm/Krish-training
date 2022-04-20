package com.gray.alphagen.instabot.controllers;

import com.gray.alphagen.instabot.services.FacebookService;
import com.gray.alphagen.instabot.services.impl.YmlServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.facebook.api.Facebook;
import org.springframework.social.facebook.api.FacebookLink;
import org.springframework.social.facebook.api.impl.FacebookTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Pasindu Raveen
 * Date: 19-Apr-22
 * Time: 4:55 PM
 * instaBot
 */
@RestController
@RequestMapping("/facebook/")
public class FacebookController {

    FacebookService facebookService;

    Facebook facebookApi;

    @Autowired
    public FacebookController(FacebookService facebookService) {
        this.facebookService = facebookService;
        facebookApi = facebookService.getFacebookApi();
    }

    @GetMapping("user")
    public String getUserdata() {
        String[] feilds = {"id", "first_name", "name", "email", "birthday"};
        return facebookApi.fetchObject("me", String.class, feilds);
    }
    @GetMapping("testpoint")
    public void contentPubish(){
        FacebookLink link = new FacebookLink("https://sloanreview.mit.edu/wp-content/uploads/2020/04/GEN-Altschuler-Interdepartmental-Strife-Crisis-Stress-Business-Unity-1290x860-1.jpg",
                "Unity of Society",
                "The Social Project",
                "Era of Automation ");
        facebookApi.feedOperations().postLink("Publishing 1",link);
    }
}
