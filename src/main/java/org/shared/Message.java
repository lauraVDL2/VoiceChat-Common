package org.shared;

public class Message {

    private MessageType messageType;

    private String payload;

    public Message() {}

    public Message(MessageType messageType, String payload) {
        this.messageType = messageType;
        this.payload = payload;
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

}
