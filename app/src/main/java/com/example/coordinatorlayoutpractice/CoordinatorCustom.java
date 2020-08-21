/*
package com.example.coordinatorlayoutpractice;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public class CoordinatorCustom  extends CoordinatorLayout {

    private boolean mPassScrolling = true;

    public CoordinatorCustom(@NonNull Context context) {
        super(context);
    }

    public CoordinatorCustom(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onStartNestedScroll(View child, View target, int nestedScrollAxes) {
        return mPassScrolling && super.onStartNestedScroll(child, target, nestedScrollAxes);
    }

    public void setPassScrolling(boolean passScrolling) {
        mPassScrolling = passScrolling;
    }
}
*/
