package org.shared.pojo;

import java.io.Serializable;
import java.util.Set;

public class Voice implements Serializable {
    private static final long serialVersionUID = 1L;

    private Set<String> participants;
    private byte[] audio;
    private String meetingId;

    public Voice() {

    }

    public Set<String> getParticipants() {
        return participants;
    }

    public void setParticipants(Set<String> participants) {
        this.participants = participants;
    }

    public byte[] getAudio() {
        return audio;
    }

    public void setAudio(byte[] audio) {
        this.audio = audio;
    }

    public String getMeetingId() {
        return meetingId;
    }

    public void setMeetingId(String meetingId) {
        this.meetingId = meetingId;
    }
}
