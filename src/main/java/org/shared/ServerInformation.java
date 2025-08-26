package org.shared;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.shared.entity.User;

import java.util.concurrent.ConcurrentHashMap;

public class ServerInformation {

    public ConcurrentHashMap<String, UserSessionStatus> getOnlineUsers() {
        return onlineUsers;
    }

    public ServerInformation() {

    }

    public void setOnlineUsers(ConcurrentHashMap<String, UserSessionStatus> onlineUsers) {
        this.onlineUsers = onlineUsers;
    }

    private ConcurrentHashMap<String, UserSessionStatus> onlineUsers = new ConcurrentHashMap<>();

}
