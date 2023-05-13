package com.dbq.principle.liskovSubstitution.two;

/**
 * @author dabaoqiang
 */
public class SquareTwo implements QuadRangle {

    private long length;

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    @Override
    public long getWidth() {
        return length;
    }

    @Override
    public long getHeight() {
        return length;
    }
}
