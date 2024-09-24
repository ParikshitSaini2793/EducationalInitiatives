package com.designpatterns.creational.factory;

public class FacebookPlatform implements SocialMediaPlatform {
    @Override
    public void createPost(String content) {
        System.out.println("Posted on Facebook: " + content);
    }
}