package org.shared.pojo;

public class Camera {
    private String userEmailAddress;
    private String meetingId;
    private byte[] frames;

    public Camera() {

    }

    public String getUserEmailAddress() {
        return userEmailAddress;
    }

    public void setUserEmailAddress(String userEmailAddress) {
        this.userEmailAddress = userEmailAddress;
    }

    public String getMeetingId() {
        return meetingId;
    }

    public void setMeetingId(String meetingId) {
        this.meetingId = meetingId;
    }

    public byte[] getFrames() {
        return frames;
    }

    public void setFrames(byte[] frames) {
        this.frames = frames;
    }
}
