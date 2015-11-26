//
// DO NOT EDIT THIS FILE, IT HAS BEEN GENERATED USING AndroidAnnotations 3.0.1.
//


package com.yxst.epic.yixin.view;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import com.miicaa.home.R.id;
import com.miicaa.home.R.layout;
import com.viewpagerindicator.CirclePageIndicator;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;


/**
 * We use @SuppressWarning here because our java code
 * generator doesn't know that there is no need
 * to import OnXXXListeners from View as we already
 * are in a View.
 * 
 */
@SuppressWarnings("unused")
public final class BiaoQingView_
    extends BiaoQingView
    implements HasViews, OnViewChangedListener
{

    private boolean alreadyInflated_ = false;
    private final OnViewChangedNotifier onViewChangedNotifier_ = new OnViewChangedNotifier();

    public BiaoQingView_(Context context) {
        super(context);
        init_();
    }

    public BiaoQingView_(Context context, AttributeSet attrs) {
        super(context, attrs);
        init_();
    }

    public BiaoQingView_(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init_();
    }

    public static BiaoQingView build(Context context) {
        BiaoQingView_ instance = new BiaoQingView_(context);
        instance.onFinishInflate();
        return instance;
    }

    /**
     * The mAlreadyInflated_ hack is needed because of an Android bug
     * which leads to infinite calls of onFinishInflate()
     * when inflating a layout with a parent and using
     * the <merge /> tag.
     * 
     */
    @Override
    public void onFinishInflate() {
        if (!alreadyInflated_) {
            alreadyInflated_ = true;
            inflate(getContext(), layout.simple_circles, this);
            onViewChangedNotifier_.notifyViewChanged(this);
        }
        super.onFinishInflate();
    }

    private void init_() {
        OnViewChangedNotifier previousNotifier = OnViewChangedNotifier.replaceNotifier(onViewChangedNotifier_);
        OnViewChangedNotifier.registerOnViewChangedListener(this);
        OnViewChangedNotifier.replaceNotifier(previousNotifier);
    }

    public static BiaoQingView build(Context context, AttributeSet attrs) {
        BiaoQingView_ instance = new BiaoQingView_(context, attrs);
        instance.onFinishInflate();
        return instance;
    }

    public static BiaoQingView build(Context context, AttributeSet attrs, int defStyle) {
        BiaoQingView_ instance = new BiaoQingView_(context, attrs, defStyle);
        instance.onFinishInflate();
        return instance;
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        mPager = ((ViewPager) hasViews.findViewById(id.pager));
        mIndicator = ((CirclePageIndicator) hasViews.findViewById(id.indicator));
        init();
    }

}