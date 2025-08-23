package org.shared.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

@RelationshipEntity
public class ReadStatus {

    @Property(name = "isRead")
    private boolean isRead;

    @StartNode
    @JsonBackReference("message")
    private Message message;

    @EndNode
    @JsonBackReference("user")
    private User user;

    @JsonCreator
    public ReadStatus() {

    }

    public ReadStatus(boolean isRead, Message message, User user) {
        this.isRead = isRead;
        this.message = message;
        this.user = user;
    }

    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean read) {
        isRead = read;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
