package com.gray.alphagen.instabot.services.impl;

import com.gray.alphagen.instabot.models.AccessToken;
import com.gray.alphagen.instabot.services.FacebookService;
import com.gray.alphagen.instabot.services.YmlService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.social.facebook.api.Facebook;
import org.springframework.social.facebook.api.impl.FacebookTemplate;
import org.springframework.social.facebook.connect.FacebookConnectionFactory;
import org.springframework.social.oauth2.OAuth2Parameters;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Pasindu Raveen
 * Date: 19-Apr-22
 * Time: 12:19 AM
 * instaBot
 */
@Slf4j
@Service
public class FacebookServiceImpl implements FacebookService {

    @Value("${spring.social.facebook.app-id}")
    private String fb_appId;
    @Value("${spring.social.facebook.app-secret}")
    private String fb_appSecret;
    @Value("${spring.host.url}")
    private String hostURL;

    static AccessToken accessTokenLatest;
    Facebook facebookApi;
    YmlService ymlService;

    @Autowired
    public FacebookServiceImpl(YmlServiceImpl ymlService) {
        this.ymlService = ymlService;
        facebookApi = new FacebookTemplate(accessTokenLatest.getToken());
        log.info("token from file - " + accessTokenLatest.getToken());
    }

    private FacebookConnectionFactory createFBConnectionFactory() {
        return new FacebookConnectionFactory(fb_appId, fb_appSecret);
    }

    @Override
    public String generateFacebookAuthorizationURL() {
        OAuth2Parameters parameters = new OAuth2Parameters();
        parameters.setRedirectUri(hostURL);
        parameters.setScope("email");
        return createFBConnectionFactory().getOAuthOperations().buildAuthenticateUrl(parameters);
    }

    @Override
    public String generateFacebookAccessToken(String code) {
        return createFBConnectionFactory().getOAuthOperations().exchangeForAccess(code, hostURL, null).getAccessToken();
    }

    @Override
    public Facebook getFacebookApi() {
        return facebookApi;
    }

    public static AccessToken getAccessTokenLatest() {
        return accessTokenLatest;
    }
}
