package org.shared.entity;

import com.fasterxml.jackson.annotation.*;
import org.neo4j.ogm.annotation.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@NodeEntity
@JsonIdentityInfo(
        generator = ObjectIdGenerators.UUIDGenerator.class,
        property = "@json_id"
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = Group.class, name = "group"),
        @JsonSubTypes.Type(value = Conversation.class, name = "conversation")
})
public class Conversation {

    @Id
    @GeneratedValue
    private Long id;

    @Property("type")
    private String type;

    @Relationship(type = "CONTAINS", direction = Relationship.Direction.INCOMING)
    private List<Message> messages = new ArrayList<>();

    @Relationship(type = "HAS", direction = Relationship.Direction.OUTGOING)
    private Set<User> participants = new HashSet<>();

    public Conversation() {}

    public Conversation(List<Message> messages, Set<User> participants) {
        this.messages = messages;
        this.participants = participants;
    }

    public Set<User> getParticipants() {
        return participants;
    }

    public void setParticipants(Set<User> participants) {
        this.participants = participants;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
