package org.shared.entity;

import com.fasterxml.jackson.annotation.*;
import org.neo4j.ogm.annotation.*;

@RelationshipEntity(type = "READ_BY")
@JsonIdentityInfo(
        generator = ObjectIdGenerators.UUIDGenerator.class,
        property = "@json_id"
)
public class ReadStatus {

    @Id
    @GeneratedValue
    private Long id;

    @Property(name = "isRead")
    private boolean isRead;

    @StartNode
    //@JsonBackReference("messageReference")
    private Message message;

    @EndNode
    //@JsonBackReference("userReference")
    private User user;

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

    public Long getId() {
        return id;
    }

}
