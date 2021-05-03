package com.jonathanbgjo.cocowatch.config;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AmazonConfig {
    public AmazonS3 s3() {
        AWSCredentials awsCredentials = new BasicAWSCredentials(
                accessKey: "AKIAQSEQA7HMQD5GY3NE",
                secretKey: "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"
        );
    }
}
