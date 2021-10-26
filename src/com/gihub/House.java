package com.gihub;

import java.util.List;

public class House {
    private float area;
    private int story;
    private List<Window> windows;
    private int door;
    private String color;

    public House(){
    }

    public House(float area, int story, List<Window> windows, int door, String color) {
        this.area = area;
        this.story = story;
        this.windows = windows;
        this.door = door;
        this.color = color;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public int getStory() {
        return story;
    }

    public void setStory(int story) {
        this.story = story;
    }

    public List<Window> getWindows() {
        return windows;
    }

    public void setWindows(List<Window> windows) {
        this.windows = windows;
    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
