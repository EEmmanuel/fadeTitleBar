package com.example.emmanuel.fadetitlebar;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

/**
 * Created by emmanuel on 07/08/16.
 */
public class ScrollViewHelper extends ScrollView {

    private OnScrollViewListener mOnScrollViewListener;

    public ScrollViewHelper(Context context) {
        super(context);
    }
    public ScrollViewHelper(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    public ScrollViewHelper(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public interface OnScrollViewListener {
        void onScrollChanged(ScrollViewHelper v, int l, int t, int oldl, int oldt);
    }

    public void setOnScrollViewListener(OnScrollViewListener l) {
        this.mOnScrollViewListener = l;
    }

    protected void onScrollChanged(int l, int t, int oldl, int oldt) {
        mOnScrollViewListener.onScrollChanged( this, l, t, oldl, oldt );
        super.onScrollChanged( l, t, oldl, oldt );
    }
}
