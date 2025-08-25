package org.shared;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.KeyDeserializer;
import org.shared.entity.User;

public class UserKeyDeserializer extends KeyDeserializer {

    @Override
    public Object deserializeKey(String key, DeserializationContext ctxt) {
        User user = new User();
        user.setEmailAddress(key);
        return user;
    }
}
