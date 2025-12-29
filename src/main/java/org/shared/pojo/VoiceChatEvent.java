package org.shared.pojo;

import java.util.HashMap;
import java.util.Map;

public class VoiceChatEvent {
    private String id;
    private String start;
    private String end;
    private String organizer;
    private Boolean isOnlineMeeting;
    private String subject;
    private String timezone;
    private Map<String, String> attendees = new HashMap<>();

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

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public Map<String, String> getAttendees() {
        return attendees;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
