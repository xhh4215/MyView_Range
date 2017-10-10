package com.example.xiaoheihei;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RegionIterator;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by xhh on 2017/10/10.
 */

public class MyResgionView extends View {
    private Paint paint;

    public MyResgionView(Context context) {
        super(context);
        paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(4);

    }

    public MyResgionView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyResgionView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //Region region = new Region(10,10,100,100);
        // drawRegin(canvas ,region,paint);
        //绘制半椭圆形状
        Path path = new Path();
        RectF rectf = new RectF(100, 100, 200, 300);
        path.addOval(rectf, Path.Direction.CCW);
        Region region1 = new Region();
        region1.setPath(path, new Region(100, 100, 200, 200));
        drawRegin(canvas, region1, paint);


    }

    private void drawRegin(Canvas canvas, Region region, Paint paint) {
        RegionIterator iter = new RegionIterator(region);
        Rect rect = new Rect();
        while (iter.next(rect)) {
            canvas.drawRect(rect, paint);
        }
    }
}
