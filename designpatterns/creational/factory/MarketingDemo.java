package com.designpatterns.creational.factory;

public class MarketingDemo {
    public static void main(String[] args) {
        SocialMediaPlatform facebook = SocialMediaFactory.getPlatform("facebook");
        SocialMediaPlatform twitter = SocialMediaFactory.getPlatform("twitter");
        
        facebook.createPost("Check out our new product!");
        twitter.createPost("Big sale coming soon! #discount");
    }
}