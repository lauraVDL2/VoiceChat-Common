package org.shared;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.junit.jupiter.api.Test;
import org.shared.entity.*;
import org.shared.entity.Message;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

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

    @Test
    void serializeConversation() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper()
                .registerModule(new JavaTimeModule())
                .enable(SerializationFeature.INDENT_OUTPUT);
        Conversation conversation = new Conversation();
        User user1 = new User();
        user1.setDisplayName("toto");
        User user2 = new User();
        user2.setDisplayName("tata");
        Message message = new Message();
        message.setTime(LocalDateTime.now());
        message.setContent("toto");
        user1.setMessages(List.of(message));

        ReadStatus readStatus = new ReadStatus(true, message, user1);
        ReadStatus readStatus1 = new ReadStatus(false, message, user2);
        message.setReadStatuses(List.of(readStatus1, readStatus));
        conversation.setParticipants(Set.of(user1, user2));
        conversation.setMessages(List.of(message));
        String json = objectMapper.writeValueAsString(conversation);
        assertNotNull(json);
        Conversation conversation1 = objectMapper.readValue(json, Conversation.class);
        assertEquals(conversation1.getMessages().get(0).getContent(), "toto");
    }

    @Test
    void serializeOnlineUsers() throws JsonProcessingException {
        ServerInformation serverInformation = new ServerInformation();
        ObjectMapper mapper = JsonMapper.getJsonMapper();
        String json = mapper.writeValueAsString(serverInformation);
        mapper.readValue(json, ServerInformation.class);
    }

    @Test
    void serializeGroup() throws JsonProcessingException {
        Group group = new Group();
        group.setName("toto");
        group.setId(1L);
        ObjectMapper mapper = JsonMapper.getJsonMapper();
        String json = mapper.writeValueAsString(group);
        Conversation conversation = mapper.readValue(json, Conversation.class);
        assertEquals(group.getId(), conversation.getId());
    }

    @Test
    void serializeGroupsInList() throws JsonProcessingException {
        Group group = new Group();
        group.setName("toto");
        group.setId(1L);
        group.setType("group");

        List<Conversation> conversations = List.of(group);

        ObjectMapper mapper = JsonMapper.getJsonMapper();
        String json = mapper.writeValueAsString(conversations);

        List<Conversation> deserialized = mapper.readValue(
                json,
                mapper.getTypeFactory()
                        .constructCollectionType(List.class, Conversation.class)
        );

        assertEquals(1, deserialized.size());
        assertInstanceOf(Group.class, deserialized.get(0));
        assertEquals(group.getId(), deserialized.get(0).getId());
        assertEquals("toto", ((Group) deserialized.get(0)).getName());
    }

}
