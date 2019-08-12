package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {

    private Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mPaint.setColor(Color.BLACK);

        mPaint.setStyle(Paint.Style.FILL);
        canvas.drawArc(200,200,600,400
                ,0,180,false,mPaint);

        canvas.drawArc(200,200,600,400
                ,-110,60,true,mPaint);

        mPaint.setStyle(Paint.Style.STROKE);
        canvas.drawArc(200,200,600,400
                ,190,50,false,mPaint);
    }
}
