package com.binary;

public class Rectangle {
    private int length = 0;
    private int height = 0;


    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int calcArea(){
        return length*height;
    }
    public int calcPerimeter(){
        return (2* (length+height));
    }

}
