package com.jonathanbgjo.cocowatch.datastore;

import com.jonathanbgjo.cocowatch.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {
    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();
    static{
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "jonjo", null));
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "cc", null));

    }
}