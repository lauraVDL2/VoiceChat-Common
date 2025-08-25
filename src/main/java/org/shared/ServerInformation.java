package org.shared;

import org.shared.entity.User;

import java.util.concurrent.ConcurrentHashMap;

public class ServerInformation {

    private ConcurrentHashMap<User, String> onlineUsers = new ConcurrentHashMap<>();

    public ServerInformation() {

    }

    public ConcurrentHashMap<User, String> getOnlineUsers() {
        return onlineUsers;
    }

    public void setOnlineUsers(ConcurrentHashMap<User, String> onlineUsers) {
        this.onlineUsers = onlineUsers;
    }

}
