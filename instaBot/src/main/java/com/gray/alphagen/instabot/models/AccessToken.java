package com.gray.alphagen.instabot.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Pasindu Raveen
 * Date: 19-Apr-22
 * Time: 3:04 PM
 * instaBot
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AccessToken {
    private String token;
    private String userName;
    private Date generatedDate;
}
