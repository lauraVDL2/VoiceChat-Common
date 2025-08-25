package org.shared;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.shared.entity.User;

import java.util.concurrent.ConcurrentHashMap;

public class ServerInformation {

    private ConcurrentHashMap<String, String> onlineUsers = new ConcurrentHashMap<>();

    public ServerInformation() {

    }

}
