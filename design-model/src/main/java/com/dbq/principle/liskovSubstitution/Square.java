package com.dbq.principle.liskovSubstitution;

/**
 * @author dabaoqiang
 */
public class Square extends Rectangle {

    private Long length;

    public Long getLength() {
        return length;
    }

    public void setLength(Long length) {
        this.length = length;
    }

    @Override
    public Long getHeight() {
        return getLength();
    }

    @Override
    public void setHeight(Long height) {
     setLength(height);
    }

    @Override
    public Long getWidth() {
        return getLength();
    }

    @Override
    public void setWidth(Long width) {
        setLength(width);
    }
}
