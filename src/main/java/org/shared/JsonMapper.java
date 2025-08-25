package org.shared;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.shared.entity.User;

public class JsonMapper {

    private static ObjectMapper objectMapper = new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .registerModule(new SimpleModule().addKeyDeserializer(User.class, new UserKeyDeserializer()));

    public static ObjectMapper getJsonMapper() {
        return objectMapper;
    }
}

