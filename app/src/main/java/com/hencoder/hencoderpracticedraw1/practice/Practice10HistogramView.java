package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import java.util.Random;

public class Practice10HistogramView extends View {

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    int mRectWidth = 80;
    int kongXi = 20;

    int height = 30;

    Paint paint = new Paint();
    Random random = new Random();


    int xyHeight = 550;
    int xStart = 200;


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图


        //画坐标系
        paint.setColor(Color.WHITE);
        paint.setStrokeWidth(3);
        paint.setStyle(Paint.Style.FILL);
        float[] points = {xStart, 100, 200, xyHeight, 200, xyHeight, 1050, xyHeight};
        canvas.drawLines(points, paint);


        //画方条
        paint.setColor(Color.rgb(74, 181, 0));
        int count = 7;
        for (int index = 0; index < count; index++) {
            canvas.drawRect(xStart + kongXi * (index + 1) + mRectWidth * index, xyHeight - height * (random.nextInt(10) + 1), xStart + kongXi * (index + 1) + mRectWidth * (index + 1), xyHeight, paint);
        }

        //画文案分类
        paint.setColor(Color.WHITE);

        paint.setTextSize(18);
        for (int index = 0; index < count; index++) {
            canvas.drawText("lin" + index, xStart + kongXi * (index + 1) + mRectWidth * (index + 1) - mRectWidth / 2, xyHeight + kongXi, paint);
        }

        //直方图的标题
        paint.setTextSize(35);
        canvas.drawText("azhansy 直方图", xStart + kongXi * (3 + 1) + mRectWidth * 2, xyHeight + kongXi * 5, paint);


    }
}
