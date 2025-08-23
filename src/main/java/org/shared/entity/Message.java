package org.shared.entity;

import org.neo4j.ogm.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@NodeEntity
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

    public Message() {

    }

    public Message(LocalDateTime time, String content) {
        this.time = time;
        this.content = content;
    }

    public List<ReadStatus> getReadStatuses() {
        return readStatuses;
    }

    public void setReadStatuses(List<ReadStatus> readStatuses) {
        this.readStatuses = readStatuses;
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
