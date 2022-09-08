package com.emmanuelscode;

public class Dimension {
    private final int height;
    private final int width;
    private final int depth;

    public Dimension(int height, int width, int depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getDepth() {
        return depth;
    }
}
