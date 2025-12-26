package org.shared.mapped_entity;

public class VoiceChatCalendar {
    private String ownerEmailAddress;
    private String ownerMicrosoftEmailAddress;
    private String startWeekTime;
    private String endWeekTime;

    public VoiceChatCalendar() {

    }

    public String getOwnerEmailAddress() {
        return ownerEmailAddress;
    }

    public void setOwnerEmailAddress(String ownerEmailAddress) {
        this.ownerEmailAddress = ownerEmailAddress;
    }

    public String getOwnerMicrosoftEmailAddress() {
        return ownerMicrosoftEmailAddress;
    }

    public void setOwnerMicrosoftEmailAddress(String ownerMicrosoftEmailAddress) {
        this.ownerMicrosoftEmailAddress = ownerMicrosoftEmailAddress;
    }

    public String getStartWeekTime() {
        return startWeekTime;
    }

    public void setStartWeekTime(String startWeekTime) {
        this.startWeekTime = startWeekTime;
    }

    public String getEndWeekTime() {
        return endWeekTime;
    }

    public void setEndWeekTime(String endWeekTime) {
        this.endWeekTime = endWeekTime;
    }
}
