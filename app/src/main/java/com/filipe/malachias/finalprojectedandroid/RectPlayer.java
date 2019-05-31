package com.filipe.malachias.finalprojectedandroid;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public class RectPlayer implements GameObject {

    private Rect rectangle;
    private int color;
    private Drawable drawable;

    public Rect getRectangle()
    {
        return rectangle;
    }


    public RectPlayer (Context context, Rect rectangle, int color)
    {
        this.rectangle = rectangle;
        this.color = color;
        this.drawable = context.getResources().getDrawable(R.drawable.center);
    }

    @Override
    public void draw(Canvas canvas)
    {
        Paint paint = new Paint();
        paint.setColor(color);

        drawable.setBounds(rectangle);
        drawable.draw(canvas);
    }

    @Override
    public void update()
    {

    }

    public void update(Point point)
    {
        rectangle.set(point.x - rectangle.width()/2, point.y - rectangle.height()/2, point.x + rectangle.width()/2, point.y + rectangle.height()/2);
    }
}
