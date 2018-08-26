package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    Paint paint = new Paint();
    RectF rectF = new RectF(200, 100, 700, 600);


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图

        paint.setColor(Color.RED);

        canvas.drawArc(rectF, -180, 125, true, paint);

        paint.setColor(Color.YELLOW);

        canvas.drawArc(rectF, -55, 55, true, paint);

        paint.setColor(Color.WHITE);
        canvas.drawArc(rectF, 0, 15, true, paint);

        paint.setColor(Color.BLACK);
        canvas.drawArc(rectF, 15, 15, true, paint);

        paint.setColor(Color.BLUE);
        canvas.drawArc(rectF, 30, 40, true, paint);

        paint.setColor(Color.DKGRAY);
        canvas.drawArc(rectF, 70, 110, true,paint);
    }
}
