package com.metacoding.myhttp2;

import lombok.*;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

//@ jvm이보는 주석

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Post {
    private int userId;
    private int id;
    private String title;
    private boolean completed;

}
