package org.shared.entity;

import com.fasterxml.jackson.annotation.*;
import org.neo4j.ogm.annotation.*;

import java.util.ArrayList;
import java.util.List;

@NodeEntity
@JsonIdentityInfo(
        generator = ObjectIdGenerators.UUIDGenerator.class,
        property = "@json_id"
)
public class User {

    @Id
    @GeneratedValue
    private Long id;

    @Property(name = "userName")
    private String userName;

    @Property(name = "displayName")
    private String displayName;

    @Property(name = "password")
    private String password;

    @Property(name = "emailAddress")
    @Index(unique = true)
    private String emailAddress;

    @Property(name = "avatar")
    private String avatar;

    @Relationship(type = "SENT", direction = Relationship.Direction.OUTGOING)
    private List<Message> messages = new ArrayList<>();

    @Relationship(type = "PARTICIPATES_IN", direction = Relationship.Direction.INCOMING)
    //@JsonManagedReference("userConversations")
    private List<Conversation> conversation = new ArrayList<>();

    public User() {}

    public User(String emailAddress, String displayName, String password) {
        this.displayName = displayName;
        this.emailAddress = emailAddress;
        this.password = password;
    }

    public User(String emailAddress, String password) {
        this.emailAddress = emailAddress;
        this.password = password;
    }

    public List<Conversation> getConversation() {
        return conversation;
    }

    public void setConversation(List<Conversation> conversation) {
        this.conversation = conversation;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Long getId() {
        return this.id;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

}
