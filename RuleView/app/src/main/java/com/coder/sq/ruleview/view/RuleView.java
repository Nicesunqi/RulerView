package com.coder.sq.ruleview.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.view.View;

import com.coder.sq.ruleview.R;

/**
 * Created by Administrator on 2017/11/20.
 */

public class RuleView extends View{

    //当前进度
    private float currentScale;
    //进度颜色
    private int progressColor;
    //短进度颜色
    private int shortScaleColor;
    //长进度颜色
    private int longScaleColor;
    //进度文字颜色
    private int scaleTxtColor;

    //最大进度
    private int MAX_PROGRESS = 100;
    //最小进度
    private int MIN_PROGRESS = 0;

    private Paint progressPint = new Paint();
    private Paint shortScalePint = new Paint();
    private Paint longScalePint = new Paint();
    private Paint scaleTxtPint = new Paint();

    public RuleView(Context context) {
        super(context);
        init();
    }

    public RuleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public RuleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    void init(){
        currentScale = 45;
        progressColor = ContextCompat.getColor(getContext(),R.color.progress);
        shortScaleColor = ContextCompat.getColor(getContext(),R.color.short_scale);
        longScaleColor = ContextCompat.getColor(getContext(),R.color.long_scale);
        scaleTxtColor = ContextCompat.getColor(getContext(),R.color.scale_txt);


    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.draw
    }
}
