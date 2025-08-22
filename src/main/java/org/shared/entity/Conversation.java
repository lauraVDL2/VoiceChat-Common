package org.shared.entity;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@NodeEntity
public class Conversation {

    @Relationship(type = "HAS_MESSAGES", direction = Relationship.Direction.INCOMING)
    private List<Message> messages = new ArrayList<>();

    @Relationship(type = "PARTICIPATES_IN", direction = Relationship.Direction.OUTGOING)
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
}
