package org.shared.entity;

import com.fasterxml.jackson.annotation.*;
import org.neo4j.ogm.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@NodeEntity
@JsonIdentityInfo(
        generator = ObjectIdGenerators.UUIDGenerator.class,
        property = "@json_id"
)
public class Message {
    @Id
    @GeneratedValue
    private Long id;

    @Property("time")
    private LocalDateTime time;

    @Property("content")
    private String content;

    @Relationship(value = "READ_BY", direction = Relationship.Direction.INCOMING)
    private List<ReadStatus> readStatuses = new ArrayList<>();

    @Relationship(type = "SENT_BY", direction = Relationship.Direction.INCOMING)
    private User sender;

    public Message() {

    }

    public Message(LocalDateTime time, String content) {
        this.time = time;
        this.content = content;
    }

    public Message(LocalDateTime time, String content, User sender) {
        this.time = time;
        this.content = content;
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

    public List<ReadStatus> getReadStatuses() {
        return readStatuses;
    }

    public void setReadStatuses(List<ReadStatus> readStatuses) {
        this.readStatuses = readStatuses;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }
}
