package org.shared.entity;

import org.neo4j.ogm.annotation.*;

import java.time.LocalDateTime;

@RelationshipEntity
public class Message {
    @Id
    @GeneratedValue
    private Long id;

    private LocalDateTime time;

    private String content;

    @StartNode
    private User sender;

    @EndNode
    private Conversation conversation;

    public Message() {

    }

    public Message(LocalDateTime time, String content, User sender, Conversation conversation) {
        this.time = time;
        this.content = content;
        this.sender = sender;
        this.conversation = conversation;
    }

    public Conversation getConversation() {
        return conversation;
    }

    public void setConversation(Conversation conversation) {
        this.conversation = conversation;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Long getId() {
        return id;
    }
}
