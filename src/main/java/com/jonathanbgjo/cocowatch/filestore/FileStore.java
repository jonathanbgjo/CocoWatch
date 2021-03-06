package com.jonathanbgjo.cocowatch.filestore;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.ObjectMetadata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.Map;
import java.util.Optional;

@Service
public class FileStore {
    //will use the amazonconfig class to store images (or anything we want: files,zips);
    private final AmazonS3 s3;

    @Autowired
    public FileStore(AmazonS3 s3) {
        this.s3 = s3;
    }
    //save file to amazon s3
    public void save(String path,
                     String fileName,
                     Optional<Map<String,String>> optionalMetadata,
                     InputStream inputStream){
        ObjectMetadata metadata = new ObjectMetadata();
        //check if there is metadata
        optionalMetadata.ifPresent(map -> {
            if(!map.isEmpty()){
                map.forEach(metadata::addUserMetadata);
            }
        });
        try{
            s3.putObject(path, fileName, inputStream, metadata);
        }catch(AmazonServiceException e){
            throw new IllegalStateException("Failed to store file to s3", e);
        }
    }
}
