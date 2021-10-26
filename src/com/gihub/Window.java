package com.gihub;

public class Window {
    private float length;
    private float width;
    private float height;
    private float diagonal;
    private int count;

    public Window(float length, float width, float height, float diagonal, int count) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.diagonal = diagonal;
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(float diagonal) {
        this.diagonal = diagonal;



    }


}

