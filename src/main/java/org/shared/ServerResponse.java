package org.shared;

public class ServerResponse {
    private ServerResponseStatus serverResponseStatus;
    private ServerResponseMessage serverResponseMessage;
    private String payload;
    private byte[] binaryPayload;
    private String message;
    private ServerInformation serverInformation;
    private String correlationId;

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
}
