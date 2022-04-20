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
 * Time: 3:10 PM
 * instaBot
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PageId {
    private String id;
    private String name;
    private Date date;
}
