package org.shared;

import java.util.HashMap;
import java.util.Map;

public class Message {

    private MessageType messageType;

    private String payload;

    private int offset;

    private byte[] binaryPayload;

    private String correlationId;

    private Map<String, String> userMessageMap = new HashMap<>();

    public Message() {}

    public Message(MessageType messageType, String payload) {
        this.messageType = messageType;
        this.payload = payload;
    }

    public Message(MessageType messageType, byte[] binaryPayload) {
        this.messageType = messageType;
        this.binaryPayload = binaryPayload;
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }

    public String getPayload() {
        return payload;
    }

    public void setMsg(String msg) {
        this.payload = payload;
    }

    public byte[] getBinaryPayload() {
        return binaryPayload;
    }

    public void setBinaryPayload(byte[] binaryPayload) {
        this.binaryPayload = binaryPayload;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
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
}
