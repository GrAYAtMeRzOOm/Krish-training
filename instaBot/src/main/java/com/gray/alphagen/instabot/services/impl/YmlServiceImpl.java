package com.gray.alphagen.instabot.services.impl;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.gray.alphagen.instabot.models.AccessToken;
import com.gray.alphagen.instabot.models.PageId;
import com.gray.alphagen.instabot.models.SaveData;
import com.gray.alphagen.instabot.services.FacebookService;
import com.gray.alphagen.instabot.services.YmlService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Pasindu Raveen
 * Date: 19-Apr-22
 * Time: 3:20 PM
 * instaBot
 */

@Slf4j
@Service
public class YmlServiceImpl implements YmlService {


    private ObjectMapper mapper;
    private SaveData readValues;


    public YmlServiceImpl() throws IOException {
        readYml();
    }

    @Override
    public void saveAccessToken(AccessToken token) throws IOException {
        FacebookServiceImpl.accessTokenLatest = token;
        readValues.addAccessToken(token);
        writeYml();
    }

    @Override
    public void savePageId(PageId pageId) throws IOException {
        readValues.addPageId(pageId);
        writeYml();
    }

    @Override
    public List<AccessToken> getAllAccessToken() {
        return readValues.getTokenList();
    }

    @Override
    public List<PageId> getAllPagesIds() {
        return readValues.getPageIdList();
    }

    private void readYml() throws StreamReadException, DatabindException, IOException {
        File file = new File("F:/LearnWithKrish/instaBot/src/main/resources/tokens/accesstokens.yml");
        if (file.length() > 0) {
            mapper = new ObjectMapper(new YAMLFactory());
            mapper.findAndRegisterModules();
            readValues = mapper.readValue(file, SaveData.class);
            FacebookServiceImpl.accessTokenLatest = readValues.getTokenList().get(0);
        } else {
            mapper = new ObjectMapper(new YAMLFactory());
            readValues = new SaveData();
        }
    }

    private void writeYml() throws StreamReadException, DatabindException, IOException {
        mapper.findAndRegisterModules();
        mapper.writeValue(new File("F:/LearnWithKrish/instaBot/src/main/resources/tokens/accesstokens.yml"), readValues);
    }


}
