package com.gray.alphagen.instabot.services;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.gray.alphagen.instabot.models.AccessToken;
import com.gray.alphagen.instabot.models.PageId;
import org.springframework.social.facebook.api.Page;

import java.io.IOException;
import java.util.List;

/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Pasindu Raveen
 * Date: 19-Apr-22
 * Time: 3:18 PM
 * instaBot
 */
public interface YmlService {

    public void saveAccessToken(AccessToken token) throws IOException;
    public void savePageId(PageId pageId) throws IOException;

    public List<AccessToken> getAllAccessToken();
    public List<PageId> getAllPagesIds();
}
