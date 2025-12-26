package org.shared.mapped_entity;

public class VoiceChatEvent {
    private String start;
    private String end;
    private String organizer;
    private Boolean isOnlineMeeting;
    private String subject;

    public VoiceChatEvent() {

    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getOrganizer() {
        return organizer;
    }

    public void setOrganizer(String organizer) {
        this.organizer = organizer;
    }

    public Boolean getOnlineMeeting() {
        return isOnlineMeeting;
    }

    public void setOnlineMeeting(Boolean onlineMeeting) {
        isOnlineMeeting = onlineMeeting;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
