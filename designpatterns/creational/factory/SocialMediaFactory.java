package com.designpatterns.creational.factory;

public class SocialMediaFactory {
    public static SocialMediaPlatform getPlatform(String platformType) {
        if (platformType.equalsIgnoreCase("facebook")) {
            return new FacebookPlatform();
        } else if (platformType.equalsIgnoreCase("twitter")) {
            return new TwitterPlatform();
        }
        return null;
    }
}