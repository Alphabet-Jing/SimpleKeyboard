package com.alphabet.simplekeyboard.library;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

/**
 * Created by alphabet on 15/10/14.
 */
public class DefaultKeyboard extends RelativeLayout {

    public DefaultKeyboard(Context context) {
        super(context);
        init();
    }

    public DefaultKeyboard(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public DefaultKeyboard(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init(){
        LayoutInflater.from(getContext()).inflate(R.layout.default_keyboard_rl,this);
    }
}
