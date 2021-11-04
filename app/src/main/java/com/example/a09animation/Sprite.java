package com.example.a09animation;

import android.graphics.RectF;

public class Sprite extends RectF {
    private int dx,dy,color;
    public Sprite(float left, float top, float right, float bottom, int dx, int dy, int color) {
        super(left, top, right, bottom);
        this.dx=dx;
        this.dy=dy;
        this.color=color;
    }
}
