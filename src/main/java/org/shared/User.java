package org.shared;

public class User {

    private String id;

    private String userName;

    private String displayName;

    private String password;

    private String emailAddress;

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

    public String getId() {
        return this.id;
    }

}
