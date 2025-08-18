package org.shared;

public class ServerResponse {
    private ServerResponseStatus serverResponseStatus;
    private ServerResponseMessage serverResponseMessage;
    private String payload;
    private String message;

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

}
