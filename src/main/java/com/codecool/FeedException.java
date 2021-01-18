package com.codecool;

public class FeedException extends Exception{
    private FeedExceptionCode myFeedExceptionCode;

    public FeedException(FeedExceptionCode myFeedExceptionCode) {
        this.myFeedExceptionCode = myFeedExceptionCode;
    }

    public FeedException(String message, FeedExceptionCode myFeedExceptionCode) {
        super(message);
        this.myFeedExceptionCode = myFeedExceptionCode;
    }

    @Override
    public String toString() {
        return "FeedException{" +
                "myFeedExceptionCode=" + myFeedExceptionCode +
                '}';
    }
}
