package com.example.kucherandroid;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class RecurtionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new RecurtionDraw(this));
    }
    private class RecurtionDraw extends View {

        public RecurtionDraw(Context context) {
            super(context);
        }

        @Override
        protected void onDraw(@NonNull Canvas canvas) {
            super.onDraw(canvas);
            drawCircle(canvas,getWidth() / 3, getWidth() / 2,getHeight() / 2);
        }
        public void drawCircle(Canvas canvas,int r, int x, int y) {
            if(r < 50) {
                return;
            }
            Paint p = new Paint();
            p.setStyle(Paint.Style.STROKE);
            canvas.drawCircle(x,y,r,p);
            drawCircle(canvas,r / 2,x + r, y );
            drawCircle(canvas,r / 2,x - r, y);
            drawCircle(canvas,r / 2,x, y + r);
            drawCircle(canvas,r / 2,x, y - r);
        }
    }
}