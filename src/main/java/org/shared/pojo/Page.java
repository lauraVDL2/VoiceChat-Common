package org.shared.pojo;

public class Page {
    private int offset;
    private int limit;

    public Page() {
        this.offset = 0;
        this.limit = 20;
    }

    public Page(int offset, int limit) {
        this.offset = offset;
        this.limit = limit;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}
