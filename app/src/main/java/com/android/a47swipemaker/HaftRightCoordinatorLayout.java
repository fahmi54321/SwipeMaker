package com.android.a47swipemaker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import com.xenione.libs.swipemaker.AbsCoordinatorLayout;
import com.xenione.libs.swipemaker.SwipeLayout;

public class HaftRightCoordinatorLayout extends AbsCoordinatorLayout {

    //todo 1
    private View backgroundView;
    private SwipeLayout foregroundView;

    //todo 2
    public HaftRightCoordinatorLayout(Context context) {
        super(context);
    }
    public HaftRightCoordinatorLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    //todo 3
    @Override
    public void doInitialViewsLocation() {
        foregroundView = (SwipeLayout) findViewById(R.id.foregroundView);
        backgroundView = findViewById(R.id.backgroundView);
        foregroundView.anchor(backgroundView.getRight(),backgroundView.getLeft());         // style 1
//        foregroundView.anchor(1-backgroundView.getWidth(),0,backgroundView.getRight());  // style 2
    }

    @Override
    public void onTranslateChange(float globalPercent, int index, float relativePercent) {

    }
}
