package org.shared;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.shared.entity.User;

import static org.junit.jupiter.api.Assertions.*;

public class SerializationTest {

    @Test
    void serializeUser() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        User user = new User();
        user.setDisplayName("toto");
        String json = objectMapper.writeValueAsString(user);
        assertNotNull(json);
        User user1 = objectMapper.readValue(json, User.class);
        assertEquals(user1.getDisplayName(), "toto");
    }

}
