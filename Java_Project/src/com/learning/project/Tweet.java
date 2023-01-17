package com.learning.project;

public class Tweet {
    private int tweetId;
    private String tweetMessage;
    private User tweetOwner;
    private boolean isDeleted;

    //Parameterized Constructor -> Initialization
    public Tweet(int tweetId, String tweetMessage, User tweetOwner) {
        this.tweetId = tweetId;
        setTweetMessage(tweetMessage);
        this.tweetOwner = tweetOwner;
        this.isDeleted = false;
    }

    public void deleteTweet(){
        this.isDeleted = true;
    }

    public void setTweetMessage(String tweetMessage) {
        if (tweetMessage.length() > 200) {
            System.out.println("tweet message length should be less than 200 characters");
            return;
        } else {
            this.tweetMessage = tweetMessage;
        }
    }
}
