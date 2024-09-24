package com.designpatterns.creational.factory;

public class TwitterPlatform implements SocialMediaPlatform {
    @Override
    public void createPost(String content) {
        System.out.println("Tweeted: " + content);
    }
}