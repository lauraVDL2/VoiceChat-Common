package org.shared;

public class ServerResponse {
    private ServerResponseStatus serverResponseStatus;
    private ServerResponseMessage serverResponseMessage;

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
