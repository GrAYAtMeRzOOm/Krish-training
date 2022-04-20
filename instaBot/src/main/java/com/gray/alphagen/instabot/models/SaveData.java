package com.gray.alphagen.instabot.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Pasindu Raveen
 * Date: 19-Apr-22
 * Time: 3:08 PM
 * instaBot
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SaveData {
    private List<AccessToken> tokenList = new ArrayList<>();
    private List<PageId> pageIdList = new ArrayList<>();

    public AccessToken getAccessTokenByIndex(int id) {
        return tokenList.get(id);
    }

    public PageId getPageIdByIndex(int id) {
        return pageIdList.get(id);
    }

    public void addPageId(PageId pageId) {
        pageIdList.add(pageId);
    }

    public void addAccessToken(AccessToken accessToken) {
        tokenList.add(accessToken);
    }

}
