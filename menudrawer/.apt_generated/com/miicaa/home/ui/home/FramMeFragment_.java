//
// DO NOT EDIT THIS FILE, IT HAS BEEN GENERATED USING AndroidAnnotations 3.0.1.
//


package com.miicaa.home.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.miicaa.home.R.layout;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;

public final class FramMeFragment_
    extends FramMeFragment
    implements HasViews, OnViewChangedListener
{

    private final OnViewChangedNotifier onViewChangedNotifier_ = new OnViewChangedNotifier();
    private View contentView_;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        OnViewChangedNotifier previousNotifier = OnViewChangedNotifier.replaceNotifier(onViewChangedNotifier_);
        init_(savedInstanceState);
        super.onCreate(savedInstanceState);
        OnViewChangedNotifier.replaceNotifier(previousNotifier);
    }

    public View findViewById(int id) {
        if (contentView_ == null) {
            return null;
        }
        return contentView_.findViewById(id);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        contentView_ = super.onCreateView(inflater, container, savedInstanceState);
        if (contentView_ == null) {
            contentView_ = inflater.inflate(layout.home_fram_me_fragment, container, false);
        }
        return contentView_;
    }

    private void init_(Bundle savedInstanceState) {
        OnViewChangedNotifier.registerOnViewChangedListener(this);
        afterInject();
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    public static FramMeFragment_.FragmentBuilder_ builder() {
        return new FramMeFragment_.FragmentBuilder_();
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        editme = ((ImageButton) hasViews.findViewById(com.miicaa.home.R.id.edit_me));
        name = ((TextView) hasViews.findViewById(com.miicaa.home.R.id.home_fram_me_name_text));
        homeFramMe = ((LinearLayout) hasViews.findViewById(com.miicaa.home.R.id.homeFramMe));
        head = ((ImageView) hasViews.findViewById(com.miicaa.home.R.id.home_fram_me_head_view));
        {
            View view = hasViews.findViewById(com.miicaa.home.R.id.edit_me);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        FramMeFragment_.this.editme();
                    }

                }
                );
            }
        }
        initData();
    }

    public static class FragmentBuilder_ {

        private Bundle args_;

        private FragmentBuilder_() {
            args_ = new Bundle();
        }

        public FramMeFragment build() {
            FramMeFragment_ fragment_ = new FramMeFragment_();
            fragment_.setArguments(args_);
            return fragment_;
        }

    }

}
