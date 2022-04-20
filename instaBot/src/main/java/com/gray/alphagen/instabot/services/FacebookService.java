package com.gray.alphagen.instabot.services;

import com.gray.alphagen.instabot.services.impl.FacebookServiceImpl;
import org.springframework.social.facebook.api.Facebook;

/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Pasindu Raveen
 * Date: 19-Apr-22
 * Time: 12:29 AM
 * instaBot
 */

public interface FacebookService {

    public String generateFacebookAuthorizationURL();
    public String generateFacebookAccessToken(String code);
    public Facebook getFacebookApi();
}
