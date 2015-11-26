//
// DO NOT EDIT THIS FILE, IT HAS BEEN GENERATED USING AndroidAnnotations 3.0.1.
//


package com.yxst.epic.yixin.fragment;

import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import com.miicaa.home.R.layout;
import com.yxst.epic.yixin.adapter.ChatListAdapter_;
import com.yxst.epic.yixin.preference.CachePrefs_;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;

public final class ChatListFragment_
    extends ChatListFragment
    implements HasViews, OnViewChangedListener
{

    private final OnViewChangedNotifier onViewChangedNotifier_ = new OnViewChangedNotifier();
    private View contentView_;
    public final static String LOCAL_USER_NAME_ARG = "localUserName";

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
            contentView_ = inflater.inflate(layout.fragment_chat_list, container, false);
        }
        return contentView_;
    }

    private void init_(Bundle savedInstanceState) {
        mCachePrefs = new CachePrefs_(getActivity());
        OnViewChangedNotifier.registerOnViewChangedListener(this);
        injectFragmentArguments_();
        mChatListAdapter = ChatListAdapter_.getInstance_(getActivity());
        AfterInject();
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    public static ChatListFragment_.FragmentBuilder_ builder() {
        return new ChatListFragment_.FragmentBuilder_();
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        mListView = ((ListView) hasViews.findViewById(android.R.id.list));
        {
            AdapterView<?> view = ((AdapterView<?> ) hasViews.findViewById(android.R.id.list));
            if (view!= null) {
                view.setOnItemClickListener(new OnItemClickListener() {


                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        ChatListFragment_.this.onItemClick(((Cursor) parent.getAdapter().getItem(position)));
                    }

                }
                );
            }
        }
        afterViews();
    }

    private void injectFragmentArguments_() {
        Bundle args_ = getArguments();
        if (args_!= null) {
            if (args_.containsKey(LOCAL_USER_NAME_ARG)) {
                localUserName = args_.getString(LOCAL_USER_NAME_ARG);
            }
        }
    }

    public static class FragmentBuilder_ {

        private Bundle args_;

        private FragmentBuilder_() {
            args_ = new Bundle();
        }

        public ChatListFragment build() {
            ChatListFragment_ fragment_ = new ChatListFragment_();
            fragment_.setArguments(args_);
            return fragment_;
        }

        public ChatListFragment_.FragmentBuilder_ localUserName(String localUserName) {
            args_.putString(LOCAL_USER_NAME_ARG, localUserName);
            return this;
        }

    }

}
