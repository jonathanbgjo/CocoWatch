package com.jonathanbgjo.cocowatch.bucket;

public enum BucketName {

    PROFILE_IMAGE("cocowatch-dev");
    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }

}
