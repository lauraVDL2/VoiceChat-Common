package org.shared;

import org.shared.pojo.Page;

import java.util.HashMap;
import java.util.Map;

public class ServerResponse {
    private ServerResponseStatus serverResponseStatus;
    private ServerResponseMessage serverResponseMessage;
    private String payload;
    private byte[] binaryPayload;
    private String message;
    private ServerInformation serverInformation;
    private String correlationId;
    private Map<String, String> userMessageMap = new HashMap<>();
    private Page page;

    public ServerInformation getServerInformation() {
        return serverInformation;
    }

    public void setServerInformation(ServerInformation serverInformation) {
        this.serverInformation = serverInformation;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public ServerResponseMessage getServerResponseMessage() {
        return serverResponseMessage;
    }

    public void setServerResponseMessage(ServerResponseMessage serverResponseMessage) {
        this.serverResponseMessage = serverResponseMessage;
    }

    public ServerResponseStatus getServerResponseStatus() {
        return serverResponseStatus;
    }

    public void setServerResponseStatus(ServerResponseStatus serverResponseStatus) {
        this.serverResponseStatus = serverResponseStatus;
    }

    public byte[] getBinaryPayload() {
        return binaryPayload;
    }

    public void setBinaryPayload(byte[] binaryPayload) {
        this.binaryPayload = binaryPayload;
    }


    public String getCorrelationId() {
        return correlationId;
    }

    public void setCorrelationId(String correlationId) {
        this.correlationId = correlationId;
    }

    public Map<String, String> getUserMessageMap() {
        return userMessageMap;
    }

    public void setUserMessageMap(Map<String, String> userMessageMap) {
        this.userMessageMap = userMessageMap;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }
}
