package org.shared;

public class Message {

    private MessageType messageType;

    private String msg;

    public Message() {}

    public Message(MessageType messageType, String msg) {
        this.messageType = messageType;
        this.msg = msg;
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
