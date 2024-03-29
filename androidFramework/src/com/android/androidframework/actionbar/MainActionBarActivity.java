package com.android.androidframework.actionbar;

import com.android.androidframework.R;
import com.android.androidframework.utils.Utils;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;

import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public abstract class MainActionBarActivity extends ActionBarActivity {

	String showBackStr = null;
	Boolean isShowBackButton = false;
	ActionBar actionBar;

	protected View headView;

	protected Button rightButton;

	protected Button titleButton;

	protected Button backButton;


	LayoutInflater inflater;

	@SuppressLint("InflateParams")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		actionBar = getSupportActionBar();
		inflater = LayoutInflater.from(this);
		headView = inflater.inflate(R.layout.main_action_bar, null);
		backShow();
	}

	private void backShow() {
		if (showHeadView() == null || !showHeadView()) {
			return;
		}
		headView.setVisibility(View.VISIBLE);
		actionBar.setDisplayShowHomeEnabled(false);
		actionBar.setDisplayShowCustomEnabled(true);
		actionBar.setDisplayShowTitleEnabled(false);
		actionBar.setDisplayHomeAsUpEnabled(false);
		backButton = (Button) headView.findViewById(R.id.leftBtn);
		rightButton = (Button) headView.findViewById(R.id.rightBtn);
		titleButton = (Button) headView.findViewById(R.id.titleBtn);
		backButton.setTextColor(Color.WHITE);
		backButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				backButtonClick(v);
				//overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
			}
		});

		titleButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				titleButtonClick(v);
			}
		});
		rightButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				rightButtonClick(v);
			}
		});
		ActionBar.LayoutParams lp = new ActionBar.LayoutParams(android.view.ViewGroup.LayoutParams.MATCH_PARENT,
				android.view.ViewGroup.LayoutParams.WRAP_CONTENT);
		lp.gravity = lp.gravity & ~Gravity.HORIZONTAL_GRAVITY_MASK | Gravity.LEFT;
		actionBar.setCustomView(headView, lp);
	}

	public void setRightButtonClickable(Boolean clickable) {
		if (rightButton != null) {
			rightButton.setClickable(clickable);
		}
	}

	public Button getCenterButton() {
		return titleButton;
	}

	public Button getRightButton() {
		return rightButton;
	}

	public Button getLeftButton() {
		return backButton;
	}

	public ActionBar getMainActionBar() {
		return actionBar;
	}

	int touchY;

	@Override
	public boolean dispatchTouchEvent(MotionEvent ev) {

		if (ev.getAction() == MotionEvent.ACTION_MOVE) {
			Log.d("FramMainActionBarActivity", "dispatchTouchEvent actionmove touchY:" + ev.getY());
			activityYMove();

		}

		return super.dispatchTouchEvent(ev);
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {

		return true;
	}

	protected void activityYMove() {
		Utils.hiddenSoftBorad(this);
	}

	public abstract void backButtonClick(View v);

	public abstract void titleButtonClick(View v);

	public abstract void rightButtonClick(View v);

	public abstract Boolean showHeadView();

}
