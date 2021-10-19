package com.wellbeeing.wellbeeing.service.account;

import com.wellbeeing.wellbeeing.domain.account.Profile;
import javassist.NotFoundException;

import java.util.UUID;

public interface ProfileService {
    Profile getProfileById(UUID profileId) throws NotFoundException;
    Profile updateProfile(Profile profile, UUID profileId) throws NotFoundException;
}
