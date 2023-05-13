package com.dbq.principle.liskovSubstitution.two;

/**
 * @author dabaoqiang
 */
public class RectRangleTwo implements QuadRangle{

    private long width;

    private long height;

    public void setWidth(long width) {
        this.width = width;
    }

    public void setHeight(long height) {
        this.height = height;
    }

    @Override
    public long getWidth() {
        return width;
    }

    @Override
    public long getHeight() {
        return height;
    }
}
